package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi;

import com.avito.android.cv_actualization.deeplink.JsxCvActualizationDeeplink;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.entity.JsxActualizationBottomSheetInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import yt.AbstractC50297a;
import yt.C50299c;

/* compiled from: JsxActualizationBottomSheetActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "Lyt/a;", "Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/mvi/entity/JsxActualizationBottomSheetInternalAction;", "Lyt/c;", "_avito_job_cv-actualization-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.arch.mvi.a<AbstractC50297a, JsxActualizationBottomSheetInternalAction, C50299c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f131511a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DeepLink f131512b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.action_handler.c f131513c;

    @Inject
    public e(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l DeepLink deepLink, @Y61.k com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.action_handler.c cVar) {
        this.f131511a = aVar;
        this.f131512b = deepLink;
        this.f131513c = cVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(new c(new a(new b(y.a(this.f131511a.V9()))), this), C43175k.C(new d(this, aVar, null), c43197r1));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<JsxActualizationBottomSheetInternalAction> b(@Y61.k AbstractC50297a abstractC50297a, @Y61.k C50299c c50299c) {
        if (abstractC50297a.equals(AbstractC50297a.C12926a.f443555a)) {
            return this.f131513c.a();
        }
        if (abstractC50297a.equals(AbstractC50297a.b.f443556a)) {
            b.a.a(this.f131511a, new JsxCvActualizationDeeplink(false, false, 3, null), null, null, 6);
            return C43175k.w();
        }
        if (abstractC50297a.equals(AbstractC50297a.c.f443557a)) {
            return new C43210w(new JsxActualizationBottomSheetInternalAction.SetResult(c50299c.f443561c));
        }
        throw new NoWhenBranchMatchedException();
    }
}
