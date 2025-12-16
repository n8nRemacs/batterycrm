package com.avito.android.progress_info_toast_bar;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import dd0.InterfaceC39708a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProgressInfoToastBarImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/d;", "Lcom/avito/android/progress_info_toast_bar/ProgressInfoToastBar;", "a", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements ProgressInfoToastBar {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f231499a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ProgressInfoToastBarData f231500b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final InterfaceC39708a f231501c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public View f231502d;

    /* compiled from: ProgressInfoToastBarImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/d$a;", "", "<init>", "()V", "", "LENGTH_LONG", "J", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public d(@k Context context, @k ProgressInfoToastBarData progressInfoToastBarData, @l InterfaceC39708a interfaceC39708a) {
        this.f231499a = context;
        this.f231500b = progressInfoToastBarData;
        this.f231501c = interfaceC39708a;
    }

    @k
    public final d a() {
        f fVar = new f(this.f231499a, null, 0, 0, 14, null);
        fVar.setAnchorView(this.f231502d);
        fVar.setAnalytics(this.f231501c);
        fVar.e(this.f231500b);
        return this;
    }

    @Override // com.avito.android.progress_info_toast_bar.ProgressInfoToastBar
    public final void dismiss() {
        this.f231502d = null;
    }
}
