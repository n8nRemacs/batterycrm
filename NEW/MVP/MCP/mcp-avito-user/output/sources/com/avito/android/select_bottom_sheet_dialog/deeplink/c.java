package com.avito.android.select_bottom_sheet_dialog.deeplink;

import Y61.k;
import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: JobSelectBottomSheetDialogDeeplinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_bottom_sheet_dialog/deeplink/c;", "Ldagger/internal/h;", "Lcom/avito/android/select_bottom_sheet_dialog/deeplink/b;", "a", "_avito_job_select-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f266878e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30102l3 f266879a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final dv.b f266880b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dv.b f266881c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<R0> f266882d;

    /* compiled from: JobSelectBottomSheetDialogDeeplinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_bottom_sheet_dialog/deeplink/c$a;", "", "<init>", "()V", "_avito_job_select-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k C30102l3 c30102l3, @k dv.b bVar, @k dv.b bVar2, @k Provider provider) {
        this.f266879a = c30102l3;
        this.f266880b = bVar;
        this.f266881c = bVar2;
        this.f266882d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f266879a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f266880b.get();
        a.b bVar = (a.b) this.f266881c.get();
        R0 r02 = this.f266882d.get();
        f266878e.getClass();
        return new b(context, interfaceC4053a, bVar, r02);
    }
}
