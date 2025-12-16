package com.avito.android.autoteka.presentation.previewsearch.mvi;

import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchDetails;
import com.avito.android.autoteka.items.fullScreenError.previewsearch.ButtonData;
import com.avito.android.autoteka.items.fullScreenError.previewsearch.PreviewSearchFullScreenErrorItem;
import com.avito.android.autoteka.items.previewGeneration.PreviewGenerationItem;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchAction;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchInternalAction;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: AutotekaPreviewSearchReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements u<AutotekaPreviewSearchInternalAction, AutotekaPreviewSearchState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AutotekaPreviewSearchDetails f97664b;

    @Inject
    public l(@Y61.k AutotekaPreviewSearchDetails autotekaPreviewSearchDetails) {
        this.f97664b = autotekaPreviewSearchDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final AutotekaPreviewSearchState a(AutotekaPreviewSearchInternalAction autotekaPreviewSearchInternalAction, AutotekaPreviewSearchState autotekaPreviewSearchState) {
        AutotekaPreviewSearchState fullScreenError;
        AutotekaPreviewSearchInternalAction autotekaPreviewSearchInternalAction2 = autotekaPreviewSearchInternalAction;
        AutotekaPreviewSearchState autotekaPreviewSearchState2 = autotekaPreviewSearchState;
        AutotekaPreviewSearchDetails autotekaPreviewSearchDetails = this.f97664b;
        String str = autotekaPreviewSearchDetails.f96224b;
        int i12 = 1;
        boolean zK2 = str != null ? C43066x.K(str) : true;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (autotekaPreviewSearchInternalAction2 instanceof AutotekaPreviewSearchInternalAction.Waiting) {
            PreviewGenerationItem previewGenerationItem = new PreviewGenerationItem(objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
            String strD = ((AutotekaPreviewSearchInternalAction.Waiting) autotekaPreviewSearchInternalAction2).f97627b;
            if (strD == null) {
                strD = autotekaPreviewSearchState2.getF97628b();
            }
            fullScreenError = new AutotekaPreviewSearchState.Waiting(previewGenerationItem, strD, zK2);
        } else if (autotekaPreviewSearchInternalAction2 instanceof AutotekaPreviewSearchInternalAction.ServerError) {
            ApiError apiError = ((AutotekaPreviewSearchInternalAction.ServerError) autotekaPreviewSearchInternalAction2).f97624b;
            PrintableText printableTextC = apiError instanceof ApiError.IncorrectData ? null : com.avito.android.autoteka.helpers.j.c(apiError);
            PrintableText printableTextB = com.avito.android.autoteka.helpers.j.b(apiError);
            boolean z12 = apiError instanceof ApiError.IncorrectData;
            fullScreenError = new AutotekaPreviewSearchState.FullScreenError(new PreviewSearchFullScreenErrorItem(null, printableTextC, printableTextB, z12 ? null : Integer.valueOf(R.drawable.img_cog), z12 ? new ButtonData(com.avito.android.printable_text.b.c(R.string.autoteka_open_instruction_dialog_button_text, new Serializable[0]), AutotekaPreviewSearchAction.ShowInstructionDialog.f97616b) : new ButtonData(com.avito.android.printable_text.b.c(R.string.autoteka_preview_try_again, new Serializable[0]), AutotekaPreviewSearchAction.RetrySearchPreview.f97614b), 1, null), autotekaPreviewSearchState2.getF97628b(), zK2);
        } else {
            if (autotekaPreviewSearchInternalAction2 instanceof AutotekaPreviewSearchInternalAction.Preview) {
                return new AutotekaPreviewSearchState.Data(((AutotekaPreviewSearchInternalAction.Preview) autotekaPreviewSearchInternalAction2).f97623b, autotekaPreviewSearchState2.getF97628b(), zK2, autotekaPreviewSearchDetails.f96229g);
            }
            if (!(autotekaPreviewSearchInternalAction2 instanceof AutotekaPreviewSearchInternalAction.InfoMessage)) {
                return autotekaPreviewSearchState2;
            }
            fullScreenError = new AutotekaPreviewSearchState.FullScreenError(((AutotekaPreviewSearchInternalAction.InfoMessage) autotekaPreviewSearchInternalAction2).f97619b, autotekaPreviewSearchState2.getF97628b(), zK2);
        }
        return fullScreenError;
    }
}
