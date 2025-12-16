package ru.cyberity.cbr.presentation.screen.preview.selfie;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.view.C23060r0;
import androidx.view.N0;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.io.File;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.VideoRequiredType;
import ru.cyberity.cbr.core.data.model.g;
import ru.cyberity.cbr.core.data.model.p;
import ru.cyberity.cbr.core.domain.model.a;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.domain.n;
import ru.cyberity.cbr.presentation.screen.preview.b;
import ru.cyberity.log.LoggerType;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRPreviewSelfieViewModel.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0016ABCB7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\u00020\u00112\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0002¢\u0006\u0004\b\u0016\u0010\u001bJ\u0019\u0010\u0016\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u0016\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u0011H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J'\u0010\u0016\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010#J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b\u0016\u0010&J\u000f\u0010'\u001a\u00020\u0002H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b\u0016\u0010,J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J!\u0010\u0016\u001a\u00020\u00112\b\u00102\u001a\u0004\u0018\u0001012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b\u0016\u00105R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u00104\u001a\u0004\u0018\u0001038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/selfie/b;", "Lru/cyberity/cbr/presentation/screen/preview/b;", "Lru/cyberity/cbr/presentation/screen/preview/selfie/b$d;", "Lru/cyberity/cbr/core/data/model/Document;", "document", "Landroidx/lifecycle/r0;", "savedStateHandle", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/cbr/domain/n;", "uploadDocumentVideoSelfieUseCase", "Lru/cyberity/cbr/core/domain/b;", "countriesUseCase", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;Landroidx/lifecycle/r0;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;Lru/cyberity/cbr/domain/n;Lru/cyberity/cbr/core/domain/b;)V", "Lkotlin/G0;", "l", "()V", "", "any", "a", "(Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "(Ljava/lang/Exception;)V", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "(Lru/cyberity/cbr/core/data/model/g;)V", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/e;", Navigation.CONFIG, "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "show", "(Z)V", "j", "()Lru/cyberity/cbr/presentation/screen/preview/selfie/b$d;", "i", "", "rotation", "(I)V", "Lru/cyberity/cbr/core/data/model/p;", "error", "onHandleError", "(Lru/cyberity/cbr/core/data/model/p;)V", "Ljava/io/File;", "file", "", "phrase", "(Ljava/io/File;Ljava/lang/String;)V", "m", "Landroidx/lifecycle/r0;", "n", "Lru/cyberity/cbr/domain/n;", "Lkotlinx/coroutines/flow/n2;", "o", "Lkotlinx/coroutines/flow/n2;", "videoSelfie", "k", "()Ljava/lang/String;", "p", "b", "c", "d", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends ru.cyberity.cbr.presentation.screen.preview.b<d> {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @k
    private final C23060r0 savedStateHandle;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @k
    private final n uploadDocumentVideoSelfieUseCase;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @k
    private final n2<File> videoSelfie;

    /* compiled from: CBRPreviewSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/selfie/b$b;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "Lru/cyberity/cbr/presentation/screen/preview/selfie/b$c;", "params", "<init>", "(Lru/cyberity/cbr/presentation/screen/preview/selfie/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/presentation/screen/preview/selfie/b$c;", "b", "()Lru/cyberity/cbr/presentation/screen/preview/selfie/b$c;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.preview.selfie.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12535b implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final c params;

        public C12535b(@k c cVar) {
            this.params = cVar;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final c getParams() {
            return this.params;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C12535b) && L.f(this.params, ((C12535b) other).params);
        }

        public int hashCode() {
            return this.params.hashCode();
        }

        @k
        public String toString() {
            return "ShowSelfiePicker(params=" + this.params + ')';
        }
    }

    /* compiled from: CBRPreviewSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/selfie/b$c;", "", "", "idDocSetType", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final String idDocSetType;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final String type;

        public c(@k String str, @l String str2) {
            this.idDocSetType = str;
            this.type = str2;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getIdDocSetType() {
            return this.idDocSetType;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return L.f(this.idDocSetType, cVar.idDocSetType) && L.f(this.type, cVar.type);
        }

        public int hashCode() {
            int iHashCode = this.idDocSetType.hashCode() * 31;
            String str = this.type;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("VideoParams(idDocSetType=");
            sb2.append(this.idDocSetType);
            sb2.append(", type=");
            return C22026a.c(sb2, this.type, ')');
        }
    }

    /* compiled from: CBRPreviewSelfieViewModel.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJV\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/selfie/b$d;", "Lru/cyberity/cbr/presentation/screen/preview/b$a;", "Ljava/io/File;", "videoFile", "", "title", "subtitle", "buttonPositive", "buttonNegative", "", "showContent", "<init>", "(Ljava/io/File;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V", "a", "(Ljava/io/File;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Lru/cyberity/cbr/presentation/screen/preview/selfie/b$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/io/File;", "l", "()Ljava/io/File;", "b", "Ljava/lang/CharSequence;", "k", "()Ljava/lang/CharSequence;", "c", "j", "d", "h", "e", "g", "f", "Z", "i", "()Z", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class d extends b.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final File videoFile;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final CharSequence title;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final CharSequence subtitle;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @l
        private final CharSequence buttonPositive;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @l
        private final CharSequence buttonNegative;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean showContent;

        public d() {
            this(null, null, null, null, null, false, 63, null);
        }

        @k
        public final d a(@l File videoFile, @l CharSequence title, @l CharSequence subtitle, @l CharSequence buttonPositive, @l CharSequence buttonNegative, boolean showContent) {
            return new d(videoFile, title, subtitle, buttonPositive, buttonNegative, showContent);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return L.f(this.videoFile, dVar.videoFile) && L.f(this.title, dVar.title) && L.f(this.subtitle, dVar.subtitle) && L.f(this.buttonPositive, dVar.buttonPositive) && L.f(this.buttonNegative, dVar.buttonNegative) && this.showContent == dVar.showContent;
        }

        @l
        /* renamed from: g, reason: from getter */
        public final CharSequence getButtonNegative() {
            return this.buttonNegative;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final CharSequence getButtonPositive() {
            return this.buttonPositive;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            File file = this.videoFile;
            int iHashCode = (file == null ? 0 : file.hashCode()) * 31;
            CharSequence charSequence = this.title;
            int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.subtitle;
            int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.buttonPositive;
            int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            CharSequence charSequence4 = this.buttonNegative;
            int iHashCode5 = (iHashCode4 + (charSequence4 != null ? charSequence4.hashCode() : 0)) * 31;
            boolean z12 = this.showContent;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            return iHashCode5 + i12;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getShowContent() {
            return this.showContent;
        }

        @l
        /* renamed from: j, reason: from getter */
        public final CharSequence getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: k, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        @l
        /* renamed from: l, reason: from getter */
        public final File getVideoFile() {
            return this.videoFile;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(videoFile=");
            sb2.append(this.videoFile);
            sb2.append(", title=");
            sb2.append((Object) this.title);
            sb2.append(", subtitle=");
            sb2.append((Object) this.subtitle);
            sb2.append(", buttonPositive=");
            sb2.append((Object) this.buttonPositive);
            sb2.append(", buttonNegative=");
            sb2.append((Object) this.buttonNegative);
            sb2.append(", showContent=");
            return r.x(sb2, this.showContent, ')');
        }

        public /* synthetic */ d(File file, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : file, (i12 & 2) != 0 ? null : charSequence, (i12 & 4) != 0 ? null : charSequence2, (i12 & 8) != 0 ? null : charSequence3, (i12 & 16) == 0 ? charSequence4 : null, (i12 & 32) != 0 ? false : z12);
        }

        public static /* synthetic */ d a(d dVar, File file, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                file = dVar.videoFile;
            }
            if ((i12 & 2) != 0) {
                charSequence = dVar.title;
            }
            CharSequence charSequence5 = charSequence;
            if ((i12 & 4) != 0) {
                charSequence2 = dVar.subtitle;
            }
            CharSequence charSequence6 = charSequence2;
            if ((i12 & 8) != 0) {
                charSequence3 = dVar.buttonPositive;
            }
            CharSequence charSequence7 = charSequence3;
            if ((i12 & 16) != 0) {
                charSequence4 = dVar.buttonNegative;
            }
            CharSequence charSequence8 = charSequence4;
            if ((i12 & 32) != 0) {
                z12 = dVar.showContent;
            }
            return dVar.a(file, charSequence5, charSequence6, charSequence7, charSequence8, z12);
        }

        public d(@l File file, @l CharSequence charSequence, @l CharSequence charSequence2, @l CharSequence charSequence3, @l CharSequence charSequence4, boolean z12) {
            this.videoFile = file;
            this.title = charSequence;
            this.subtitle = charSequence2;
            this.buttonPositive = charSequence3;
            this.buttonNegative = charSequence4;
            this.showContent = z12;
        }
    }

    /* compiled from: CBRPreviewSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/File;", "file", "Lkotlin/G0;", "<anonymous>", "(Ljava/io/File;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.selfie.CBRPreviewSelfieViewModel$onPrepare$2", f = "CBRPreviewSelfieViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<File, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435359a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435360b;

        /* compiled from: CBRPreviewSelfieViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/selfie/b$d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.selfie.CBRPreviewSelfieViewModel$onPrepare$2$1", f = "CBRPreviewSelfieViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<d, Continuation<? super d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f435362a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f435363b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f435364c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(File file, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f435364c = file;
            }

            @Override // Y41.p
            @l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@k d dVar, @l Continuation<? super d> continuation) {
                return ((a) create(dVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f435364c, continuation);
                aVar.f435363b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f435362a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return d.a((d) this.f435363b, this.f435364c, null, null, null, null, false, 62, null);
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l File file, @l Continuation<? super G0> continuation) {
            return ((e) create(file, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            e eVar = b.this.new e(continuation);
            eVar.f435360b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435359a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            CBRViewModel.updateState$default(b.this, false, new a((File) this.f435360b, null), 1, null);
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPreviewSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/selfie/b$d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.selfie.CBRPreviewSelfieViewModel$onPrepare$3", f = "CBRPreviewSelfieViewModel.kt", i = {}, l = {58, 59, 60, 61}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<d, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435365a;

        /* renamed from: b, reason: collision with root package name */
        Object f435366b;

        /* renamed from: c, reason: collision with root package name */
        Object f435367c;

        /* renamed from: d, reason: collision with root package name */
        int f435368d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f435369e;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k d dVar, @l Continuation<? super d> continuation) {
            return ((f) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            f fVar = b.this.new f(continuation);
            fVar.f435369e = obj;
            return fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 203
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.selfie.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRPreviewSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.selfie.CBRPreviewSelfieViewModel$onTakeAnotherDataClicked$1", f = "CBRPreviewSelfieViewModel.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435371a;

        /* renamed from: b, reason: collision with root package name */
        int f435372b;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            b bVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f435372b;
            if (i12 == 0) {
                C42729a0.b(obj);
                b bVar2 = b.this;
                ru.cyberity.cbr.core.data.source.dynamic.c cVarE = bVar2.getDataRepository();
                this.f435371a = bVar2;
                this.f435372b = 1;
                Object objC = ru.cyberity.cbr.core.data.source.dynamic.c.c(cVarE, null, false, this, 3, null);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bVar = bVar2;
                obj = objC;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b) this.f435371a;
                C42729a0.b(obj);
            }
            bVar.a((ru.cyberity.cbr.core.data.model.g) ((ru.cyberity.cbr.core.data.source.dynamic.a) obj).d());
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPreviewSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/selfie/b$d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.selfie.CBRPreviewSelfieViewModel$showContent$1", f = "CBRPreviewSelfieViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements p<d, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435374a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435375b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f435376c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z12, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f435376c = z12;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k d dVar, @l Continuation<? super d> continuation) {
            return ((h) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            h hVar = new h(this.f435376c, continuation);
            hVar.f435375b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435374a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return d.a((d) this.f435375b, null, null, null, null, null, this.f435376c, 31, null);
        }
    }

    /* compiled from: CBRPreviewSelfieViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.selfie.CBRPreviewSelfieViewModel$uploadDataOrMoveToStatusScreen$1", f = "CBRPreviewSelfieViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435377a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f435379c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(File file, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f435379c = file;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new i(this.f435379c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f435377a;
            if (i12 == 0) {
                C42729a0.b(obj);
                n nVar = b.this.uploadDocumentVideoSelfieUseCase;
                n.a aVar = new n.a(b.this.getDocument(), this.f435379c, b.this.k());
                this.f435377a = 1;
                obj = nVar.a((n) aVar, (Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ? extends List<ru.cyberity.cbr.core.data.model.remote.k>>>) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            ru.cyberity.cbr.core.domain.model.a aVar2 = (ru.cyberity.cbr.core.domain.model.a) obj;
            b bVar = b.this;
            if (aVar2.b()) {
                bVar.a(((a.b) aVar2).d());
            } else if (aVar2.a()) {
                bVar.a((Exception) ((a.C12482a) aVar2).d());
            }
            return G0.f406611a;
        }
    }

    public b(@k Document document, @k C23060r0 c23060r0, @k ru.cyberity.cbr.core.data.source.common.a aVar, @k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @k n nVar, @k ru.cyberity.cbr.core.domain.b bVar) {
        super(document, c23060r0, aVar, cVar, bVar);
        this.savedStateHandle = c23060r0;
        this.uploadDocumentVideoSelfieUseCase = nVar;
        this.videoSelfie = c23060r0.c("KEY_FILE", null);
        ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", "Preview Selfie is created", null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String k() {
        return (String) this.savedStateHandle.b("KEY_PHRASE");
    }

    private final void l() {
        String strK;
        File value = this.videoSelfie.getValue();
        if (value == null || (strK = k()) == null || strK.length() == 0) {
            CBRViewModel.finish$default(this, a0.a.f432636a, null, null, 6, null);
            return;
        }
        showProgress(true);
        ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", "Uploading video selfie fallback. File - " + value.getAbsolutePath() + ", Phrase - " + k(), null, 4, null);
        C43259k.d(N0.a(this), null, null, new i(value, null), 3);
    }

    public void i() {
        C43259k.d(N0.a(this), null, null, new g(null), 3);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public d getDefaultState() {
        return new d(null, null, null, null, null, false, 63, null);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    public void onHandleError(@k ru.cyberity.cbr.core.data.model.p error) {
        ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", "Preview selfie error handling... " + error, null, 4, null);
        if (error instanceof p.b) {
            l();
        } else {
            super.onHandleError(error);
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @l
    public Object onPrepare(@k Continuation<? super G0> continuation) {
        j0.b(this.videoSelfie, N0.a(this), new e(null));
        CBRViewModel.updateState$default(this, false, new f(null), 1, null);
        onLoad();
        return G0.f406611a;
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.b
    @l
    public Object a(@l ru.cyberity.cbr.core.data.model.g gVar, @l ru.cyberity.cbr.core.data.model.e eVar, @k Continuation<? super G0> continuation) {
        if (this.savedStateHandle.b("KEY_FILE") == null) {
            a(gVar);
        } else {
            showProgress(false);
            a(true);
        }
        return G0.f406611a;
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.b
    public void a(boolean show) {
        CBRViewModel.updateState$default(this, false, new h(show, null), 1, null);
    }

    public void a(int rotation) {
        l();
    }

    public final void a(@l File file, @l String phrase) {
        StringBuilder sb2 = new StringBuilder("onHandleVideoSelfie. File - ");
        sb2.append(file != null ? file.getAbsolutePath() : null);
        sb2.append(", Phrase size - ");
        sb2.append(phrase != null ? Integer.valueOf(phrase.length()) : null);
        ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", sb2.toString(), null, 4, null);
        if (file != null && phrase != null && phrase.length() != 0) {
            this.savedStateHandle.e(file, "KEY_FILE");
            this.savedStateHandle.e(phrase, "KEY_PHRASE");
            showProgress(false);
            a(true);
            return;
        }
        if (this.videoSelfie.getValue() == null) {
            CBRViewModel.finish$default(this, a0.a.f432636a, null, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object any) {
        ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", "Video Selfie uploaded successful. Document is " + getDocument().getType(), null, 4, null);
        a(getDocument());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Exception exception) {
        ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", "An error while uploading video selfie", exception);
        showProgress(false);
        CBRViewModel.throwError$default(this, exception, getDocument().getType().getValue(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(ru.cyberity.cbr.core.data.model.g applicant) {
        if (applicant == null) {
            ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", "applicant null!", null, 4, null);
            Logger.e$default(ru.cyberity.log.a.f436064a.a(LoggerType.KIBANA), "CyberityPreviewSelfie", "applicant null!", null, 4, null);
            return;
        }
        g.c.a aVarA = applicant.a(getDocument().getType());
        ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", "showPicker: docSet=" + aVarA, null, 4, null);
        if (L.f(aVarA != null ? aVarA.getVideoRequired() : null, VideoRequiredType.Enabled.getValue())) {
            ru.cyberity.cbr.presentation.screen.preview.selfie.d.a("CyberityPreviewSelfie", "showPicker: show video selfie", null, 4, null);
            fireEvent(new C12535b(new c(getDocument().getType().getValue(), g())));
        }
    }
}
