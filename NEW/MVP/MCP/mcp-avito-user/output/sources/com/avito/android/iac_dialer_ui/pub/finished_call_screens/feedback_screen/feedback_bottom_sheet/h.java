package com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.feedback_bottom_sheet;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: IacUIFeedbackBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class h extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacUIFeedbackBottomSheetState f167564l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C43108m f167565m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f167566n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f167567o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f167568p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f167569q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f167570r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(IacUIFeedbackBottomSheetState iacUIFeedbackBottomSheetState, C43108m c43108m, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f167564l = iacUIFeedbackBottomSheetState;
        this.f167565m = c43108m;
        this.f167566n = lVar;
        this.f167567o = lVar2;
        this.f167568p = lVar3;
        this.f167569q = vVar;
        this.f167570r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167570r | 1);
        Y41.l<String, G0> lVar = this.f167566n;
        Y41.l<Integer, G0> lVar2 = this.f167567o;
        A.a(this.f167564l, this.f167565m, lVar, lVar2, this.f167568p, a12, iA2);
        return G0.f406611a;
    }
}
