package com.avito.android.advert.icebreakerseditor;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.icebreakerseditor.analytics.IcebreakersEditorAnalyticsData;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IcebreakersEditorActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/advert/icebreakerseditor/IcebreakersEditorActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "Lb4/d;", VoiceInfo.STATE, "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class IcebreakersEditorActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f71187o = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public E f71188m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f71189n = C42727D.c(new c());

    /* compiled from: IcebreakersEditorActivity.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/icebreakerseditor/IcebreakersEditorActivity$a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: IcebreakersEditorActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                int i12 = IcebreakersEditorActivity.f71187o;
                IcebreakersEditorActivity icebreakersEditorActivity = IcebreakersEditorActivity.this;
                com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(1791545365, new C27801d(icebreakersEditorActivity, C22126m3.b(((D) icebreakersEditorActivity.f71189n.getValue()).getState(), a13)), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IcebreakersEditorActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/advert/icebreakerseditor/D;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/advert/icebreakerseditor/D;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<D> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final D invoke() {
            E e12 = IcebreakersEditorActivity.this.f71188m;
            if (e12 == null) {
                e12 = null;
            }
            return (D) e12.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("icebreakers");
        int intExtra = getIntent().getIntExtra("icebreakersLimit", 5);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("analyticsData");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Missing required extra: ANALYTICS_DATA");
        }
        IcebreakersEditorAnalyticsData icebreakersEditorAnalyticsData = (IcebreakersEditorAnalyticsData) parcelableExtra;
        com.avito.android.advert.icebreakerseditor.di.c cVar = (com.avito.android.advert.icebreakerseditor.di.c) C29972i.a(C29972i.b(this), com.avito.android.advert.icebreakerseditor.di.c.class);
        if (parcelableArrayListExtra != null) {
            com.avito.android.advert.icebreakerseditor.di.a.a().a(cVar, parcelableArrayListExtra, intExtra, icebreakersEditorAnalyticsData).a(this);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        androidx.view.compose.j.a(this, new C22096n(969673082, new b(), true));
    }
}
