package ru.cyberity.cbr.presentation.screen.preview.photo.common;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import androidx.view.C23060r0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.domain.m;
import ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel;
import ru.cyberity.log.logger.Logger;
import ru.cyberity.ml.core.d;

/* compiled from: CBRPreviewCommonDocumentViewModel.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/common/b;", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel;", "Lru/cyberity/cbr/core/data/model/Document;", "document", "Landroidx/lifecycle/r0;", "savedStateHandle", "Lru/cyberity/cbr/domain/m;", "uploadDocumentImagesUseCase", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/cbr/core/data/source/extensions/a;", AttachMenuItem.File.EXTENSIONS, "Lru/cyberity/cbr/core/common/k;", "rotationDetector", "Lru/cyberity/ml/core/d;", "Landroid/graphics/Bitmap;", "Lru/cyberity/ml/badphotos/models/a;", "badPhotoDetector", "Lru/cyberity/cbr/core/domain/b;", "countriesUseCase", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;Landroidx/lifecycle/r0;Lru/cyberity/cbr/domain/m;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;Lru/cyberity/cbr/core/data/source/extensions/a;Lru/cyberity/cbr/core/common/k;Lru/cyberity/ml/core/d;Lru/cyberity/cbr/core/domain/b;)V", "Lkotlin/G0;", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends CBRPreviewPhotoDocumentViewModel {

    /* compiled from: CBRPreviewCommonDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.common.CBRPreviewCommonDocumentViewModel", f = "CBRPreviewCommonDocumentViewModel.kt", i = {0}, l = {52}, m = "onPrepare", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435267a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435268b;

        /* renamed from: d, reason: collision with root package name */
        int f435270d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f435268b = obj;
            this.f435270d |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.onPrepare(this);
        }
    }

    public b(@k Document document, @k C23060r0 c23060r0, @k m mVar, @k ru.cyberity.cbr.core.data.source.common.a aVar, @k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @k ru.cyberity.cbr.core.data.source.extensions.a aVar2, @k ru.cyberity.cbr.core.common.k kVar, @k d<Bitmap, ru.cyberity.ml.badphotos.models.a> dVar, @k ru.cyberity.cbr.core.domain.b bVar) {
        super(document, c23060r0, aVar, cVar, aVar2, mVar, kVar, dVar, bVar);
        Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Preview Common Document is created", null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel, ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onPrepare(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ru.cyberity.cbr.presentation.screen.preview.photo.common.b.a
            if (r0 == 0) goto L13
            r0 = r5
            ru.cyberity.cbr.presentation.screen.preview.photo.common.b$a r0 = (ru.cyberity.cbr.presentation.screen.preview.photo.common.b.a) r0
            int r1 = r0.f435270d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f435270d = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.preview.photo.common.b$a r0 = new ru.cyberity.cbr.presentation.screen.preview.photo.common.b$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f435268b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f435270d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f435267a
            ru.cyberity.cbr.presentation.screen.preview.photo.common.b r0 = (ru.cyberity.cbr.presentation.screen.preview.photo.common.b) r0
            kotlin.C42729a0.b(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C42729a0.b(r5)
            r0.f435267a = r4
            r0.f435270d = r3
            java.lang.Object r5 = super.onPrepare(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            r0.onLoad()
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.common.b.onPrepare(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
