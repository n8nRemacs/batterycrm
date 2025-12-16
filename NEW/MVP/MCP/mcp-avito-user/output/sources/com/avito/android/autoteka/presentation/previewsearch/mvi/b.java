package com.avito.android.autoteka.presentation.previewsearch.mvi;

import com.avito.android.autoteka.presentation.previewsearch.mvi.a;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaPreviewSearchActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "it", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/a$a;", "invoke", "(Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;)Lcom/avito/android/autoteka/presentation/previewsearch/mvi/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.l<AutotekaPreviewSearchAction, a.InterfaceC2914a> {

    /* renamed from: l, reason: collision with root package name */
    public static final b f97578l = new b();

    public b() {
        super(1);
    }

    @Override // Y41.l
    public final a.InterfaceC2914a invoke(AutotekaPreviewSearchAction autotekaPreviewSearchAction) {
        AutotekaPreviewSearchAction autotekaPreviewSearchAction2 = autotekaPreviewSearchAction;
        return autotekaPreviewSearchAction2 instanceof AutotekaPreviewSearchAction.SearchPreview ? true : autotekaPreviewSearchAction2 instanceof AutotekaPreviewSearchAction.RetrySearchPreview ? true : autotekaPreviewSearchAction2 instanceof AutotekaPreviewSearchAction.RestorePreviousState ? a.InterfaceC2914a.b.f97564a : a.InterfaceC2914a.C2915a.f97563a;
    }
}
