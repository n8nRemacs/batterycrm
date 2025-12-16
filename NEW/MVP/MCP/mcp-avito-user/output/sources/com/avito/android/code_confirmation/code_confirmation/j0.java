package com.avito.android.code_confirmation.code_confirmation;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.util.V2;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: CodeReceiver.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/j0;", "Landroid/content/BroadcastReceiver;", "Lcom/avito/android/code_confirmation/code_confirmation/g0;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j0 extends BroadcastReceiver implements g0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f119560e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Activity f119561b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final IntentFilter f119562c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<String> f119563d = new io.reactivex.rxjava3.subjects.e<>();

    /* compiled from: CodeReceiver.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/E;", "", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return j0.this.f119563d.N(i0.f119558b);
        }
    }

    @Inject
    public j0(@Y61.k Activity activity, @Y61.k IntentFilter intentFilter, @Y61.k com.google.android.gms.auth.api.phone.f fVar) {
        this.f119561b = activity;
        this.f119562c = intentFilter;
        fVar.startSmsRetriever().c(new com.avito.android.bxcontent.mvi.entity.f(9)).e(new com.avito.android.bxcontent.mvi.entity.f(10));
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.g0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<String> connect() {
        return new io.reactivex.rxjava3.internal.operators.observable.C(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 6)).T(new a(), Integer.MAX_VALUE);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@Y61.l Context context, @Y61.l Intent intent) {
        Object obj = null;
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent != null ? intent.getAction() : null)) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle(0);
            }
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS", Status.class) : extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            if (parcelable == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Status status = (Status) parcelable;
            int i12 = status.f348905b;
            if (i12 != 0) {
                if (i12 == 15) {
                    V2.f318762a.j("CodeReceiver", "Timed out waiting while waiting verification code", null);
                    return;
                }
                V2.f318762a.d("CodeReceiver", "Unknown status " + status + " while waiting verification code");
                return;
            }
            String string = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            if (string == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Iterator it = C43066x.f0(string, new String[]{" "}, 0, 6).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Character chE = C43066x.E((String) next);
                if (chE != null && Character.isDigit(chE.charValue())) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                this.f119563d.onNext(str);
            } else {
                V2.f318762a.d("CodeReceiver", "Unable to get verification code from ".concat(string));
            }
        }
    }
}
