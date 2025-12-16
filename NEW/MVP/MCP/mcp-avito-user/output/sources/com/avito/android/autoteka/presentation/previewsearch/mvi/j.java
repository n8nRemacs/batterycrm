package com.avito.android.autoteka.presentation.previewsearch.mvi;

import Of.InterfaceC14680a;
import com.avito.android.arch.mvi.t;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchInternalAction;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.photo_gallery.PhotoGalleryIntentFactory;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaPreviewSearchOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "LOf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements t<AutotekaPreviewSearchInternalAction, InterfaceC14680a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f97658b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.a f97659c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PhotoGalleryIntentFactory f97660d;

    @Inject
    public j(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.autoteka.data.a aVar2, @Y61.k PhotoGalleryIntentFactory photoGalleryIntentFactory) {
        this.f97658b = aVar;
        this.f97659c = aVar2;
        this.f97660d = photoGalleryIntentFactory;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14680a b(AutotekaPreviewSearchInternalAction autotekaPreviewSearchInternalAction) {
        AutotekaPreviewSearchInternalAction autotekaPreviewSearchInternalAction2 = autotekaPreviewSearchInternalAction;
        if (autotekaPreviewSearchInternalAction2 instanceof AutotekaPreviewSearchInternalAction.InstructionDialog) {
            return InterfaceC14680a.d.f12474a;
        }
        if (autotekaPreviewSearchInternalAction2 instanceof AutotekaPreviewSearchInternalAction.HideKeyboard) {
            return InterfaceC14680a.C0800a.f12471a;
        }
        if (autotekaPreviewSearchInternalAction2 instanceof AutotekaPreviewSearchInternalAction.NavigateByDeepLink) {
            b.a.a(this.f97658b, ((AutotekaPreviewSearchInternalAction.NavigateByDeepLink) autotekaPreviewSearchInternalAction2).f97621b, null, null, 6);
        } else {
            if (autotekaPreviewSearchInternalAction2 instanceof AutotekaPreviewSearchInternalAction.ShowKeyboard) {
                return InterfaceC14680a.e.f12475a;
            }
            if (autotekaPreviewSearchInternalAction2 instanceof AutotekaPreviewSearchInternalAction.Preview) {
                this.f97659c.f();
            } else {
                if (autotekaPreviewSearchInternalAction2 instanceof AutotekaPreviewSearchInternalAction.OpenPhotoGallery) {
                    return new InterfaceC14680a.b(this.f97660d.b(Collections.singletonList(((AutotekaPreviewSearchInternalAction.OpenPhotoGallery) autotekaPreviewSearchInternalAction2).f97622b), 0, false, null));
                }
                if (autotekaPreviewSearchInternalAction2 instanceof AutotekaPreviewSearchInternalAction.SuccessPurchase) {
                    return InterfaceC14680a.c.f12473a;
                }
            }
        }
        return null;
    }
}
