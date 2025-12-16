package ru.cyberity.cbr.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.domain.l;

/* compiled from: UploadDocumentVideoSelfieUseCase.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019J3\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/domain/n;", "Lru/cyberity/cbr/domain/l;", "Lru/cyberity/cbr/domain/n$a;", "params", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "", "country", "", "Lru/cyberity/cbr/core/data/model/remote/k;", "b", "(Lru/cyberity/cbr/domain/n$a;Lru/cyberity/cbr/core/data/model/g;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/applicant/b;", "applicantRepository", "Lru/cyberity/cbr/core/data/source/settings/b;", "settingsRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/applicant/b;Lru/cyberity/cbr/core/data/source/settings/b;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "Lru/cyberity/cbr/core/b;", "serviceLocator", "(Lru/cyberity/cbr/core/b;)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class n extends l<a> {

    /* compiled from: UploadDocumentVideoSelfieUseCase.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u0010"}, d2 = {"Lru/cyberity/cbr/domain/n$a;", "Lru/cyberity/cbr/domain/l$a;", "Ljava/io/File;", "d", "Ljava/io/File;", "()Ljava/io/File;", "file", "", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "phrase", "Lru/cyberity/cbr/core/data/model/Document;", "document", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;Ljava/io/File;Ljava/lang/String;)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends l.a {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final File file;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final String phrase;

        public a(@Y61.k Document document, @Y61.k File file, @Y61.k String str) {
            super(document, null, true, 2, null);
            this.file = file;
            this.phrase = str;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        @Y61.k
        /* renamed from: e, reason: from getter */
        public final String getPhrase() {
            return this.phrase;
        }
    }

    /* compiled from: UploadDocumentVideoSelfieUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.domain.UploadDocumentVideoSelfieUseCase", f = "UploadDocumentVideoSelfieUseCase.kt", i = {}, l = {48}, m = "upload", n = {}, s = {})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f434395a;

        /* renamed from: c, reason: collision with root package name */
        int f434397c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434395a = obj;
            this.f434397c |= BeduinInputModel.MIN_TEXT_VERSION;
            return n.this.b((a) null, (ru.cyberity.cbr.core.data.model.g) null, (String) null, (Continuation<? super List<ru.cyberity.cbr.core.data.model.remote.k>>) this);
        }
    }

    public n(@Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.applicant.b bVar, @Y61.k ru.cyberity.cbr.core.data.source.settings.b bVar2, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        super(aVar, bVar, bVar2, cVar);
    }

    @Override // ru.cyberity.cbr.domain.l
    public /* bridge */ /* synthetic */ Object a(l.a aVar, ru.cyberity.cbr.core.data.model.g gVar, String str, Continuation continuation) {
        return a((a) aVar, gVar, str, (Continuation<? super List<ru.cyberity.cbr.core.data.model.remote.k>>) continuation);
    }

    @Override // ru.cyberity.cbr.domain.l
    public /* bridge */ /* synthetic */ Object b(l.a aVar, ru.cyberity.cbr.core.data.model.g gVar, String str, Continuation continuation) {
        return b((a) aVar, gVar, str, (Continuation<? super List<ru.cyberity.cbr.core.data.model.remote.k>>) continuation);
    }

    public n(@Y61.k ru.cyberity.cbr.core.b bVar) {
        this(bVar.k(), bVar.e(), bVar.z(), bVar.m());
    }

    @Y61.l
    public Object a(@Y61.k a aVar, @Y61.k ru.cyberity.cbr.core.data.model.g gVar, @Y61.k String str, @Y61.k Continuation<? super List<ru.cyberity.cbr.core.data.model.remote.k>> continuation) {
        throw new UnsupportedOperationException("Not yet implemented and never will");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@Y61.k ru.cyberity.cbr.domain.n.a r15, @Y61.k ru.cyberity.cbr.core.data.model.g r16, @Y61.k java.lang.String r17, @Y61.k kotlin.coroutines.Continuation<? super java.util.List<ru.cyberity.cbr.core.data.model.remote.k>> r18) {
        /*
            r14 = this;
            r0 = r18
            boolean r1 = r0 instanceof ru.cyberity.cbr.domain.n.b
            if (r1 == 0) goto L17
            r1 = r0
            ru.cyberity.cbr.domain.n$b r1 = (ru.cyberity.cbr.domain.n.b) r1
            int r2 = r1.f434397c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f434397c = r2
            r2 = r14
        L15:
            r11 = r1
            goto L1e
        L17:
            ru.cyberity.cbr.domain.n$b r1 = new ru.cyberity.cbr.domain.n$b
            r2 = r14
            r1.<init>(r0)
            goto L15
        L1e:
            java.lang.Object r0 = r11.f434395a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r11.f434397c
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            kotlin.C42729a0.b(r0)
            goto L8f
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            kotlin.C42729a0.b(r0)
            ru.cyberity.cbr.core.data.source.settings.b r0 = r14.getSettingsRepository()
            java.lang.String r0 = r0.a()
            ru.cyberity.cbr.core.data.model.Document r3 = r15.getDocument()
            ru.cyberity.cbr.core.data.model.DocumentType r3 = r3.getType()
            r5 = r16
            java.util.List r3 = r5.b(r3)
            java.lang.Object r3 = kotlin.collections.C42745f0.G(r3)
            ru.cyberity.cbr.core.data.model.r r3 = (ru.cyberity.cbr.core.data.model.r) r3
            if (r3 == 0) goto L61
            java.lang.String r3 = r3.getValue()
            if (r3 != 0) goto L5f
            goto L61
        L5f:
            r7 = r3
            goto L68
        L61:
            ru.cyberity.cbr.core.data.model.r$g r3 = ru.cyberity.cbr.core.data.model.r.g.f433189e
            java.lang.String r3 = r3.getValue()
            goto L5f
        L68:
            java.lang.String r3 = r15.getPhrase()
            java.lang.String r3 = ru.cyberity.cbr.core.common.s.a(r3)
            java.lang.String r5 = "X-Video-Selfie-Phrase"
            java.util.Map r9 = java.util.Collections.singletonMap(r5, r3)
            ru.cyberity.cbr.core.data.source.applicant.b r3 = r14.getApplicantRepository()
            java.io.File r6 = r15.getFile()
            r11.f434397c = r4
            r12 = 80
            r13 = 0
            r8 = 0
            r10 = 0
            r4 = r0
            r5 = r17
            java.lang.Object r0 = ru.cyberity.cbr.core.data.source.applicant.b.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r0 != r1) goto L8f
            return r1
        L8f:
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.domain.n.b(ru.cyberity.cbr.domain.n$a, ru.cyberity.cbr.core.data.model.g, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
