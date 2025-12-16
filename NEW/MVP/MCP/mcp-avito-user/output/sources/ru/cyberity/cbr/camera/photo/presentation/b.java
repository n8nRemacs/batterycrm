package ru.cyberity.cbr.camera.photo.presentation;

import Y41.p;
import Y41.q;
import Y41.t;
import androidx.compose.runtime.C22026a;
import androidx.view.N0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.B1;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.K;
import ru.cyberity.cbr.core.common.ExtensionsKt;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.data.listener.CBREvent;
import ru.cyberity.cbr.core.data.listener.CBREventHandler;
import ru.cyberity.cbr.core.data.model.r;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.cbr.core.domain.k;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRDocumentSelectorViewModel.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0019\u0017\u0012\u0014\u0015\u0016B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\u0004\b\u0000\u0010\u001b*\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001fJ\u0017\u0010\u0019\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u0019\u0010#J\u0015\u0010\u0019\u001a\u00020\"2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\u0019\u0010&J\r\u0010'\u001a\u00020\"¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\"¢\u0006\u0004\b)\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00100R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00105R\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002080\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00100R \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0:0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00100R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00100\u001a\u0004\b4\u0010>¨\u0006A"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/b;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/camera/photo/presentation/b$e;", "", "documentType", "Lru/cyberity/cbr/core/data/source/extensions/a;", "extensionProvider", "Lru/cyberity/cbr/core/domain/b;", "countriesUseCase", "Lru/cyberity/cbr/core/domain/k;", "documentsUseCase", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/source/extensions/a;Lru/cyberity/cbr/core/domain/b;Lru/cyberity/cbr/core/domain/k;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "", "c", "()Ljava/lang/CharSequence;", "d", "e", "f", "b", "Lru/cyberity/cbr/camera/photo/presentation/b$f;", "a", "()Lru/cyberity/cbr/camera/photo/presentation/b$f;", "T", "Lkotlinx/coroutines/flow/i;", "initValue", "Lkotlinx/coroutines/flow/n2;", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;)Lkotlinx/coroutines/flow/n2;", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "country", "Lkotlin/G0;", "(Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;)V", "Lru/cyberity/cbr/core/data/model/r;", "document", "(Lru/cyberity/cbr/core/data/model/r;)V", "i", "()V", "h", "Ljava/lang/String;", "Lru/cyberity/cbr/core/data/source/extensions/a;", "Lru/cyberity/cbr/core/domain/b;", "Lru/cyberity/cbr/core/domain/k;", "Lru/cyberity/cbr/core/data/source/common/a;", "Lru/cyberity/cbr/core/domain/c;", "Lkotlinx/coroutines/flow/n2;", "countries", "Lkotlinx/coroutines/flow/Z1;", "", "g", "Lkotlinx/coroutines/flow/Z1;", "dialogState", "selectedCountry", "Lru/cyberity/cbr/camera/photo/presentation/b$c;", "documents", "", "j", "selectedDialogCountryItems", "k", "()Lkotlinx/coroutines/flow/n2;", "viewState", "l", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends CBRViewModel<e> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String documentType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.extensions.a extensionProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.domain.b countriesUseCase;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.domain.k documentsUseCase;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.common.a commonRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final n2<ru.cyberity.cbr.core.domain.c> countries;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Z1<Boolean> dialogState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Z1<CBRCountryPicker.CountryItem> selectedCountry;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final n2<c> documents;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final n2<List<CBRCountryPicker.CountryItem>> selectedDialogCountryItems;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final n2<e> viewState;

    /* compiled from: CBRDocumentSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/b$b;", "", "Lru/cyberity/cbr/core/data/model/r;", "document", "", "title", "<init>", "(Lru/cyberity/cbr/core/data/model/r;Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/data/model/r;", "c", "()Lru/cyberity/cbr/core/data/model/r;", "b", "Ljava/lang/CharSequence;", "d", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.camera.photo.presentation.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12420b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final r document;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence title;

        public C12420b(@Y61.k r rVar, @Y61.l CharSequence charSequence) {
            this.document = rVar;
            this.title = charSequence;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final r getDocument() {
            return this.document;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C12420b)) {
                return false;
            }
            C12420b c12420b = (C12420b) other;
            return L.f(this.document, c12420b.document) && L.f(this.title, c12420b.title);
        }

        public int hashCode() {
            int iHashCode = this.document.hashCode() * 31;
            CharSequence charSequence = this.title;
            return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DocumentWrapper(document=");
            sb2.append(this.document);
            sb2.append(", title=");
            return AK.c.r(sb2, this.title, ')');
        }
    }

    /* compiled from: CBRDocumentSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/b$c;", "", "", "Lru/cyberity/cbr/camera/photo/presentation/b$b;", "documents", "", "currentCountryKey", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final List<C12420b> documents;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String currentCountryKey;

        public c() {
            this(null, null, 3, null);
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getCurrentCountryKey() {
            return this.currentCountryKey;
        }

        @Y61.k
        public final List<C12420b> d() {
            return this.documents;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return L.f(this.documents, cVar.documents) && L.f(this.currentCountryKey, cVar.currentCountryKey);
        }

        public int hashCode() {
            int iHashCode = this.documents.hashCode() * 31;
            String str = this.currentCountryKey;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Documents(documents=");
            sb2.append(this.documents);
            sb2.append(", currentCountryKey=");
            return C22026a.c(sb2, this.currentCountryKey, ')');
        }

        public c(@Y61.k List<C12420b> list, @Y61.l String str) {
            this.documents = list;
            this.currentCountryKey = str;
        }

        public c(List list, String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: CBRDocumentSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/b$d;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "", "countryKey", "Lru/cyberity/cbr/core/data/model/r;", "identityType", "<init>", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/model/r;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lru/cyberity/cbr/core/data/model/r;", "d", "()Lru/cyberity/cbr/core/data/model/r;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class d implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final String countryKey;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final r identityType;

        public d(@Y61.k String str, @Y61.l r rVar) {
            this.countryKey = str;
            this.identityType = rVar;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getCountryKey() {
            return this.countryKey;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final r getIdentityType() {
            return this.identityType;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return L.f(this.countryKey, dVar.countryKey) && L.f(this.identityType, dVar.identityType);
        }

        public int hashCode() {
            int iHashCode = this.countryKey.hashCode() * 31;
            r rVar = this.identityType;
            return iHashCode + (rVar == null ? 0 : rVar.hashCode());
        }

        @Y61.k
        public String toString() {
            return "SelectionChanged(countryKey=" + this.countryKey + ", identityType=" + this.identityType + ')';
        }
    }

    /* compiled from: CBRDocumentSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/b$e;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "Lru/cyberity/cbr/core/domain/c;", "countries", "", "currentCountryKey", "Lru/cyberity/cbr/camera/photo/presentation/b$c;", "documents", "", "dialogIsVisible", "", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "dialogCountryItems", "selectedCountry", "Lru/cyberity/cbr/camera/photo/presentation/b$f;", "viewText", "<init>", "(Lru/cyberity/cbr/core/domain/c;Ljava/lang/String;Lru/cyberity/cbr/camera/photo/presentation/b$c;ZLjava/util/List;Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;Lru/cyberity/cbr/camera/photo/presentation/b$f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/domain/c;", "h", "()Lru/cyberity/cbr/core/domain/c;", "b", "Ljava/lang/String;", "i", "c", "Lru/cyberity/cbr/camera/photo/presentation/b$c;", "l", "()Lru/cyberity/cbr/camera/photo/presentation/b$c;", "d", "Z", "k", "()Z", "e", "Ljava/util/List;", "j", "()Ljava/util/List;", "f", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "m", "()Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "g", "Lru/cyberity/cbr/camera/photo/presentation/b$f;", "n", "()Lru/cyberity/cbr/camera/photo/presentation/b$f;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class e implements CBRViewModel.CBRViewModelState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final ru.cyberity.cbr.core.domain.c countries;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String currentCountryKey;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final c documents;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean dialogIsVisible;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final List<CBRCountryPicker.CountryItem> dialogCountryItems;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CBRCountryPicker.CountryItem selectedCountry;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final f viewText;

        public e() {
            this(null, null, null, false, null, null, null, 127, null);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return L.f(this.countries, eVar.countries) && L.f(this.currentCountryKey, eVar.currentCountryKey) && L.f(this.documents, eVar.documents) && this.dialogIsVisible == eVar.dialogIsVisible && L.f(this.dialogCountryItems, eVar.dialogCountryItems) && L.f(this.selectedCountry, eVar.selectedCountry) && L.f(this.viewText, eVar.viewText);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            ru.cyberity.cbr.core.domain.c cVar = this.countries;
            int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            String str = this.currentCountryKey;
            int iHashCode2 = (this.documents.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            boolean z12 = this.dialogIsVisible;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            int i13 = (iHashCode2 + i12) * 31;
            List<CBRCountryPicker.CountryItem> list = this.dialogCountryItems;
            int iHashCode3 = (i13 + (list == null ? 0 : list.hashCode())) * 31;
            CBRCountryPicker.CountryItem countryItem = this.selectedCountry;
            int iHashCode4 = (iHashCode3 + (countryItem == null ? 0 : countryItem.hashCode())) * 31;
            f fVar = this.viewText;
            return iHashCode4 + (fVar != null ? fVar.hashCode() : 0);
        }

        @Y61.l
        public final List<CBRCountryPicker.CountryItem> j() {
            return this.dialogCountryItems;
        }

        /* renamed from: k, reason: from getter */
        public final boolean getDialogIsVisible() {
            return this.dialogIsVisible;
        }

        @Y61.k
        /* renamed from: l, reason: from getter */
        public final c getDocuments() {
            return this.documents;
        }

        @Y61.l
        /* renamed from: m, reason: from getter */
        public final CBRCountryPicker.CountryItem getSelectedCountry() {
            return this.selectedCountry;
        }

        @Y61.l
        /* renamed from: n, reason: from getter */
        public final f getViewText() {
            return this.viewText;
        }

        @Y61.k
        public String toString() {
            return "ViewState(countries=" + this.countries + ", currentCountryKey=" + this.currentCountryKey + ", documents=" + this.documents + ", dialogIsVisible=" + this.dialogIsVisible + ", dialogCountryItems=" + this.dialogCountryItems + ", selectedCountry=" + this.selectedCountry + ", viewText=" + this.viewText + ')';
        }

        public e(@Y61.l ru.cyberity.cbr.core.domain.c cVar, @Y61.l String str, @Y61.k c cVar2, boolean z12, @Y61.l List<CBRCountryPicker.CountryItem> list, @Y61.l CBRCountryPicker.CountryItem countryItem, @Y61.l f fVar) {
            this.countries = cVar;
            this.currentCountryKey = str;
            this.documents = cVar2;
            this.dialogIsVisible = z12;
            this.dialogCountryItems = list;
            this.selectedCountry = countryItem;
            this.viewText = fVar;
        }

        public /* synthetic */ e(ru.cyberity.cbr.core.domain.c cVar, String str, c cVar2, boolean z12, List list, CBRCountryPicker.CountryItem countryItem, f fVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : cVar, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? new c(null, null, 3, null) : cVar2, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? null : list, (i12 & 32) != 0 ? null : countryItem, (i12 & 64) != 0 ? null : fVar);
        }
    }

    /* compiled from: CBRDocumentSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lru/cyberity/cbr/core/domain/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.CBRDocumentSelectorViewModel$countries$1", f = "CBRDocumentSelectorViewModel.kt", i = {0}, l = {49, 55}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class g extends SuspendLambda implements p<InterfaceC43172j<? super ru.cyberity.cbr.core.domain.c>, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432121a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f432122b;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k InterfaceC43172j<? super ru.cyberity.cbr.core.domain.c> interfaceC43172j, @Y61.l Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = b.this.new g(continuation);
            gVar.f432122b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432121a;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f432122b;
                ru.cyberity.cbr.core.domain.b bVar = b.this.countriesUseCase;
                this.f432122b = interfaceC43172j;
                this.f432121a = 1;
                objA = bVar.a(true, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f432122b;
                C42729a0.b(obj);
                objA = ((Z) obj).f406625b;
            }
            int i13 = Z.f406624c;
            boolean z12 = objA instanceof Z.b;
            if (z12) {
                Exception exc = (Exception) Z.b(objA);
                ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
                String strA = ru.cyberity.log.c.a(interfaceC43172j);
                String message = exc.getMessage();
                if (message == null) {
                    message = "";
                }
                aVar.e(strA, message, exc);
                b bVar2 = b.this;
                CBRViewModel.throwError$default(bVar2, exc, bVar2.documentType, null, 4, null);
            } else {
                if (z12) {
                    objA = null;
                }
                this.f432122b = null;
                this.f432121a = 2;
                if (interfaceC43172j.emit(objA, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBRDocumentSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/domain/c;", "it", "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/core/domain/c;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.CBRDocumentSelectorViewModel$countries$2", f = "CBRDocumentSelectorViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements p<ru.cyberity.cbr.core.domain.c, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432124a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432125b;

        /* compiled from: CBRDocumentSelectorViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.CBRDocumentSelectorViewModel$countries$2$1", f = "CBRDocumentSelectorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f432127a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ru.cyberity.cbr.core.domain.c f432128b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ru.cyberity.cbr.core.domain.c cVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f432128b = cVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f432128b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                String currentCountryKey;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f432127a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                CBREventHandler eventHandler = n0.f432787a.getEventHandler();
                if (eventHandler != null) {
                    ru.cyberity.cbr.core.domain.c cVar = this.f432128b;
                    if (cVar == null || (currentCountryKey = cVar.getCurrentCountryKey()) == null) {
                        return G0.f406611a;
                    }
                    eventHandler.onEvent(new CBREvent.CountrySelected(currentCountryKey, false));
                }
                return G0.f406611a;
            }
        }

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l ru.cyberity.cbr.core.domain.c cVar, @Y61.l Continuation<? super G0> continuation) {
            return ((h) create(cVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = b.this.new h(continuation);
            hVar.f432125b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432124a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.cbr.core.domain.c cVar = (ru.cyberity.cbr.core.domain.c) this.f432125b;
                A1.a aVarA = N0.a(b.this);
                a aVar = new a(cVar, null);
                this.f432124a = 1;
                if (C43259k.g(aVarA.f36b, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBRDocumentSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lru/cyberity/cbr/camera/photo/presentation/b$c;", "", "e", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.CBRDocumentSelectorViewModel$documents$3", f = "CBRDocumentSelectorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements q<InterfaceC43172j<? super c>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432129a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f432130b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f432131c;

        public i(Continuation<? super i> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k InterfaceC43172j<? super c> interfaceC43172j, @Y61.k Throwable th2, @Y61.l Continuation<? super G0> continuation) {
            i iVar = b.this.new i(continuation);
            iVar.f432130b = interfaceC43172j;
            iVar.f432131c = th2;
            return iVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432129a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f432130b;
            Throwable th2 = (Throwable) this.f432131c;
            ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
            String strA = ru.cyberity.log.c.a(interfaceC43172j);
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            aVar.e(strA, message, th2);
            b bVar = b.this;
            CBRViewModel.throwError$default(bVar, th2, bVar.documentType, null, 4, null);
            return G0.f406611a;
        }
    }

    /* compiled from: CBRDocumentSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/b$c;", "it", "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/camera/photo/presentation/b$c;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.CBRDocumentSelectorViewModel$documents$4", f = "CBRDocumentSelectorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements p<c, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432133a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k c cVar, @Y61.l Continuation<? super G0> continuation) {
            return ((j) create(cVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432133a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            b.this.dialogState.setValue(Boxing.boxBoolean(false));
            return G0.f406611a;
        }
    }

    /* compiled from: CBRDocumentSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "list", "Lkotlin/G0;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.CBRDocumentSelectorViewModel$selectedDialogCountryItems$2", f = "CBRDocumentSelectorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements p<List<? extends CBRCountryPicker.CountryItem>, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432135a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432136b;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k List<CBRCountryPicker.CountryItem> list, @Y61.l Continuation<? super G0> continuation) {
            return ((k) create(list, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            k kVar = b.this.new k(continuation);
            kVar.f432136b = obj;
            return kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432135a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            List list = (List) this.f432136b;
            Z1 z12 = b.this.selectedCountry;
            b bVar = b.this;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String code = ((CBRCountryPicker.CountryItem) next).getCode();
                ru.cyberity.cbr.core.domain.c cVar = (ru.cyberity.cbr.core.domain.c) bVar.countries.getValue();
                if (L.f(code, cVar != null ? cVar.getCurrentCountryKey() : null)) {
                    str = next;
                    break;
                }
            }
            z12.setValue(str);
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/G0;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1})
    public static final class l implements InterfaceC43160i<k.b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC43160i f432138a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f432139b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC43172j f432140a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f432141b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.CBRDocumentSelectorViewModel$special$$inlined$map$1$2", f = "CBRDocumentSelectorViewModel.kt", i = {0, 0}, l = {224, 229, 226}, m = "emit", n = {"this", "country"}, s = {"L$0", "L$2"})
            /* renamed from: ru.cyberity.cbr.camera.photo.presentation.b$l$a$a, reason: collision with other inner class name */
            public static final class C12421a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f432142a;

                /* renamed from: b, reason: collision with root package name */
                int f432143b;

                /* renamed from: c, reason: collision with root package name */
                Object f432144c;

                /* renamed from: e, reason: collision with root package name */
                Object f432146e;

                /* renamed from: f, reason: collision with root package name */
                Object f432147f;

                public C12421a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f432142a = obj;
                    this.f432143b |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, b bVar) {
                this.f432140a = interfaceC43172j;
                this.f432141b = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x00a8 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, @Y61.k kotlin.coroutines.Continuation r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof ru.cyberity.cbr.camera.photo.presentation.b.l.a.C12421a
                    if (r0 == 0) goto L13
                    r0 = r11
                    ru.cyberity.cbr.camera.photo.presentation.b$l$a$a r0 = (ru.cyberity.cbr.camera.photo.presentation.b.l.a.C12421a) r0
                    int r1 = r0.f432143b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f432143b = r1
                    goto L18
                L13:
                    ru.cyberity.cbr.camera.photo.presentation.b$l$a$a r0 = new ru.cyberity.cbr.camera.photo.presentation.b$l$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f432142a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f432143b
                    r3 = 2
                    r4 = 1
                    r5 = 3
                    r6 = 0
                    if (r2 == 0) goto L52
                    if (r2 == r4) goto L41
                    if (r2 == r3) goto L39
                    if (r2 != r5) goto L31
                    kotlin.C42729a0.b(r11)
                    goto La9
                L31:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L39:
                    java.lang.Object r10 = r0.f432144c
                    kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
                    kotlin.C42729a0.b(r11)
                    goto L9a
                L41:
                    java.lang.Object r10 = r0.f432147f
                    ru.cyberity.cbr.core.data.listener.CBRCountryPicker$CountryItem r10 = (ru.cyberity.cbr.core.data.listener.CBRCountryPicker.CountryItem) r10
                    java.lang.Object r2 = r0.f432146e
                    kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
                    java.lang.Object r4 = r0.f432144c
                    ru.cyberity.cbr.camera.photo.presentation.b$l$a r4 = (ru.cyberity.cbr.camera.photo.presentation.b.l.a) r4
                    kotlin.C42729a0.b(r11)
                    r11 = r2
                    goto L6b
                L52:
                    kotlin.C42729a0.b(r11)
                    kotlinx.coroutines.flow.j r11 = r9.f432140a
                    ru.cyberity.cbr.core.data.listener.CBRCountryPicker$CountryItem r10 = (ru.cyberity.cbr.core.data.listener.CBRCountryPicker.CountryItem) r10
                    ru.cyberity.cbr.camera.photo.presentation.b r2 = r9.f432141b
                    r0.f432144c = r9
                    r0.f432146e = r11
                    r0.f432147f = r10
                    r0.f432143b = r4
                    java.lang.Object r2 = ru.cyberity.cbr.camera.photo.presentation.b.a(r2, r0)
                    if (r2 != r1) goto L6a
                    return r1
                L6a:
                    r4 = r9
                L6b:
                    if (r10 != 0) goto L76
                    ru.cyberity.cbr.core.domain.k$b r10 = new ru.cyberity.cbr.core.domain.k$b
                    r10.<init>(r6, r6, r5, r6)
                L72:
                    r8 = r11
                    r11 = r10
                    r10 = r8
                    goto L9a
                L76:
                    ru.cyberity.cbr.camera.photo.presentation.b r2 = r4.f432141b
                    ru.cyberity.cbr.core.domain.k r2 = ru.cyberity.cbr.camera.photo.presentation.b.f(r2)
                    ru.cyberity.cbr.core.domain.k$a r7 = new ru.cyberity.cbr.core.domain.k$a
                    java.lang.String r10 = r10.getCode()
                    ru.cyberity.cbr.camera.photo.presentation.b r4 = r4.f432141b
                    java.lang.String r4 = ru.cyberity.cbr.camera.photo.presentation.b.e(r4)
                    r7.<init>(r10, r4)
                    r0.f432144c = r11
                    r0.f432146e = r6
                    r0.f432147f = r6
                    r0.f432143b = r3
                    java.lang.Object r10 = r2.a(r7, r0)
                    if (r10 != r1) goto L72
                    return r1
                L9a:
                    r0.f432144c = r6
                    r0.f432146e = r6
                    r0.f432147f = r6
                    r0.f432143b = r5
                    java.lang.Object r10 = r10.emit(r11, r0)
                    if (r10 != r1) goto La9
                    return r1
                La9:
                    kotlin.G0 r10 = kotlin.G0.f406611a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.photo.presentation.b.l.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public l(InterfaceC43160i interfaceC43160i, b bVar) {
            this.f432138a = interfaceC43160i;
            this.f432139b = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public Object collect(@Y61.k InterfaceC43172j<? super k.b> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f432138a.collect(new a(interfaceC43172j, this.f432139b), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/G0;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1})
    public static final class m implements InterfaceC43160i<c> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC43160i f432148a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f432149b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC43172j f432150a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f432151b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.CBRDocumentSelectorViewModel$special$$inlined$map$2$2", f = "CBRDocumentSelectorViewModel.kt", i = {}, l = {230}, m = "emit", n = {}, s = {})
            /* renamed from: ru.cyberity.cbr.camera.photo.presentation.b$m$a$a, reason: collision with other inner class name */
            public static final class C12422a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f432152a;

                /* renamed from: b, reason: collision with root package name */
                int f432153b;

                public C12422a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f432152a = obj;
                    this.f432153b |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, b bVar) {
                this.f432150a = interfaceC43172j;
                this.f432151b = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r12, @Y61.k kotlin.coroutines.Continuation r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof ru.cyberity.cbr.camera.photo.presentation.b.m.a.C12422a
                    if (r0 == 0) goto L13
                    r0 = r13
                    ru.cyberity.cbr.camera.photo.presentation.b$m$a$a r0 = (ru.cyberity.cbr.camera.photo.presentation.b.m.a.C12422a) r0
                    int r1 = r0.f432153b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f432153b = r1
                    goto L18
                L13:
                    ru.cyberity.cbr.camera.photo.presentation.b$m$a$a r0 = new ru.cyberity.cbr.camera.photo.presentation.b$m$a$a
                    r0.<init>(r13)
                L18:
                    java.lang.Object r13 = r0.f432152a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f432153b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r13)
                    goto L82
                L29:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L31:
                    kotlin.C42729a0.b(r13)
                    kotlinx.coroutines.flow.j r13 = r11.f432150a
                    ru.cyberity.cbr.core.domain.k$b r12 = (ru.cyberity.cbr.core.domain.k.b) r12
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.List r4 = r12.d()
                    java.util.Iterator r4 = r4.iterator()
                L45:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L70
                    java.lang.Object r5 = r4.next()
                    ru.cyberity.cbr.core.data.model.r r5 = (ru.cyberity.cbr.core.data.model.r) r5
                    ru.cyberity.cbr.camera.photo.presentation.b$b r6 = new ru.cyberity.cbr.camera.photo.presentation.b$b
                    ru.cyberity.cbr.camera.photo.presentation.b r7 = r11.f432151b
                    ru.cyberity.cbr.core.data.source.extensions.a r7 = ru.cyberity.cbr.camera.photo.presentation.b.g(r7)
                    ru.cyberity.cbr.camera.photo.presentation.b r8 = r11.f432151b
                    ru.cyberity.cbr.core.data.source.dynamic.c$c r8 = ru.cyberity.cbr.camera.photo.presentation.b.i(r8)
                    r9 = 2
                    r10 = 0
                    java.lang.CharSequence r8 = ru.cyberity.cbr.core.data.model.r.a(r5, r8, r10, r9, r10)
                    android.text.Spanned r7 = r7.a(r8)
                    r6.<init>(r5, r7)
                    r2.add(r6)
                    goto L45
                L70:
                    ru.cyberity.cbr.camera.photo.presentation.b$c r4 = new ru.cyberity.cbr.camera.photo.presentation.b$c
                    java.lang.String r12 = r12.getCurrentCountryKey()
                    r4.<init>(r2, r12)
                    r0.f432153b = r3
                    java.lang.Object r12 = r13.emit(r4, r0)
                    if (r12 != r1) goto L82
                    return r1
                L82:
                    kotlin.G0 r12 = kotlin.G0.f406611a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.photo.presentation.b.m.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public m(InterfaceC43160i interfaceC43160i, b bVar) {
            this.f432148a = interfaceC43160i;
            this.f432149b = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public Object collect(@Y61.k InterfaceC43172j<? super c> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f432148a.collect(new a(interfaceC43172j, this.f432149b), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/G0;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1})
    public static final class n implements InterfaceC43160i<List<? extends CBRCountryPicker.CountryItem>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC43160i f432155a;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC43172j f432156a;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.CBRDocumentSelectorViewModel$special$$inlined$map$3$2", f = "CBRDocumentSelectorViewModel.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
            /* renamed from: ru.cyberity.cbr.camera.photo.presentation.b$n$a$a, reason: collision with other inner class name */
            public static final class C12423a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f432157a;

                /* renamed from: b, reason: collision with root package name */
                int f432158b;

                public C12423a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f432157a = obj;
                    this.f432158b |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f432156a = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.z0] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r9v2, types: [kotlinx.coroutines.flow.j] */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, @Y61.k kotlin.coroutines.Continuation r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof ru.cyberity.cbr.camera.photo.presentation.b.n.a.C12423a
                    if (r0 == 0) goto L13
                    r0 = r9
                    ru.cyberity.cbr.camera.photo.presentation.b$n$a$a r0 = (ru.cyberity.cbr.camera.photo.presentation.b.n.a.C12423a) r0
                    int r1 = r0.f432158b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f432158b = r1
                    goto L18
                L13:
                    ru.cyberity.cbr.camera.photo.presentation.b$n$a$a r0 = new ru.cyberity.cbr.camera.photo.presentation.b$n$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f432157a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f432158b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r9)
                    goto L7d
                L29:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L31:
                    kotlin.C42729a0.b(r9)
                    kotlinx.coroutines.flow.j r9 = r7.f432156a
                    ru.cyberity.cbr.core.domain.c r8 = (ru.cyberity.cbr.core.domain.c) r8
                    if (r8 == 0) goto L72
                    java.util.Map r8 = r8.h()
                    if (r8 == 0) goto L72
                    java.util.ArrayList r2 = new java.util.ArrayList
                    int r4 = r8.size()
                    r2.<init>(r4)
                    java.util.Set r8 = r8.entrySet()
                    java.util.Iterator r8 = r8.iterator()
                L51:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto L74
                    java.lang.Object r4 = r8.next()
                    java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                    java.lang.Object r5 = r4.getKey()
                    java.lang.String r5 = (java.lang.String) r5
                    java.lang.Object r4 = r4.getValue()
                    java.lang.String r4 = (java.lang.String) r4
                    ru.cyberity.cbr.core.data.listener.CBRCountryPicker$CountryItem r6 = new ru.cyberity.cbr.core.data.listener.CBRCountryPicker$CountryItem
                    r6.<init>(r5, r4)
                    r2.add(r6)
                    goto L51
                L72:
                    kotlin.collections.z0 r2 = kotlin.collections.C42784z0.f406748b
                L74:
                    r0.f432158b = r3
                    java.lang.Object r8 = r9.emit(r2, r0)
                    if (r8 != r1) goto L7d
                    return r1
                L7d:
                    kotlin.G0 r8 = kotlin.G0.f406611a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.photo.presentation.b.n.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public n(InterfaceC43160i interfaceC43160i) {
            this.f432155a = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public Object collect(@Y61.k InterfaceC43172j<? super List<? extends CBRCountryPicker.CountryItem>> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f432155a.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: CBRDocumentSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u000b\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u008a@"}, d2 = {"Lru/cyberity/cbr/core/domain/c;", "countries", "", "dialogState", "Lru/cyberity/cbr/camera/photo/presentation/b$c;", "documents", "", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "countryItems", "countryItem", "Lru/cyberity/cbr/camera/photo/presentation/b$e;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.photo.presentation.CBRDocumentSelectorViewModel$viewState$1", f = "CBRDocumentSelectorViewModel.kt", i = {0, 0, 0, 0, 0}, l = {116}, m = "invokeSuspend", n = {"countries", "documents", "countryItems", "countryItem", "dialogState"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0"})
    public static final class o extends SuspendLambda implements t<ru.cyberity.cbr.core.domain.c, Boolean, c, List<? extends CBRCountryPicker.CountryItem>, CBRCountryPicker.CountryItem, Continuation<? super e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432160a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432161b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f432162c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f432163d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f432164e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f432165f;

        public o(Continuation<? super o> continuation) {
            super(6, continuation);
        }

        @Y61.l
        public final Object a(@Y61.l ru.cyberity.cbr.core.domain.c cVar, boolean z12, @Y61.k c cVar2, @Y61.k List<CBRCountryPicker.CountryItem> list, @Y61.l CBRCountryPicker.CountryItem countryItem, @Y61.l Continuation<? super e> continuation) {
            o oVar = b.this.new o(continuation);
            oVar.f432161b = cVar;
            oVar.f432162c = z12;
            oVar.f432163d = cVar2;
            oVar.f432164e = list;
            oVar.f432165f = countryItem;
            return oVar.invokeSuspend(G0.f406611a);
        }

        @Override // Y41.t
        public /* bridge */ /* synthetic */ Object invoke(ru.cyberity.cbr.core.domain.c cVar, Boolean bool, c cVar2, List<? extends CBRCountryPicker.CountryItem> list, CBRCountryPicker.CountryItem countryItem, Continuation<? super e> continuation) {
            return a(cVar, bool.booleanValue(), cVar2, list, countryItem, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            boolean z12;
            c cVar;
            ru.cyberity.cbr.core.domain.c cVar2;
            List list;
            CBRCountryPicker.CountryItem countryItem;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432160a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.cbr.core.domain.c cVar3 = (ru.cyberity.cbr.core.domain.c) this.f432161b;
                boolean z13 = this.f432162c;
                c cVar4 = (c) this.f432163d;
                List list2 = (List) this.f432164e;
                CBRCountryPicker.CountryItem countryItem2 = (CBRCountryPicker.CountryItem) this.f432165f;
                b bVar = b.this;
                this.f432161b = cVar3;
                this.f432163d = cVar4;
                this.f432164e = list2;
                this.f432165f = countryItem2;
                this.f432162c = z13;
                this.f432160a = 1;
                if (bVar.awaitStringsReady(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z12 = z13;
                cVar = cVar4;
                cVar2 = cVar3;
                list = list2;
                countryItem = countryItem2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z14 = this.f432162c;
                CBRCountryPicker.CountryItem countryItem3 = (CBRCountryPicker.CountryItem) this.f432165f;
                List list3 = (List) this.f432164e;
                c cVar5 = (c) this.f432163d;
                ru.cyberity.cbr.core.domain.c cVar6 = (ru.cyberity.cbr.core.domain.c) this.f432161b;
                C42729a0.b(obj);
                z12 = z14;
                countryItem = countryItem3;
                list = list3;
                cVar = cVar5;
                cVar2 = cVar6;
            }
            return new e(cVar2, null, cVar, z12, list, countryItem, b.this.a(), 2, null);
        }
    }

    public b(@Y61.k String str, @Y61.k ru.cyberity.cbr.core.data.source.extensions.a aVar, @Y61.k ru.cyberity.cbr.core.domain.b bVar, @Y61.k ru.cyberity.cbr.core.domain.k kVar, @Y61.k ru.cyberity.cbr.core.data.source.common.a aVar2, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        super(aVar2, cVar);
        this.documentType = str;
        this.extensionProvider = aVar;
        this.countriesUseCase = bVar;
        this.documentsUseCase = kVar;
        this.commonRepository = aVar2;
        C43197r1 c43197r1 = new C43197r1(new h(null), C43175k.G(new g(null)));
        kotlinx.coroutines.scheduling.b bVar2 = C43262l0.f411947c;
        n2<ru.cyberity.cbr.core.domain.c> n2VarA = a((InterfaceC43160i<? extends InterfaceC43160i>) C43175k.I(bVar2, c43197r1), (InterfaceC43160i) null);
        this.countries = n2VarA;
        Z1<Boolean> z1A = p2.a(Boolean.FALSE);
        this.dialogState = z1A;
        Z1<CBRCountryPicker.CountryItem> z1A2 = p2.a(null);
        this.selectedCountry = z1A2;
        n2<c> n2VarA2 = a((InterfaceC43160i<? extends InterfaceC43160i>) C43175k.I(bVar2, new C43197r1(new j(null), new C43152f0(new m(new l(z1A2, this), this), new i(null)))), (InterfaceC43160i) new c(null, null, 3, null));
        this.documents = n2VarA2;
        n2<List<CBRCountryPicker.CountryItem>> n2VarA3 = a((InterfaceC43160i<? extends C43197r1>) new C43197r1(new k(null), new n(n2VarA)), (C43197r1) C42784z0.f406748b);
        this.selectedDialogCountryItems = n2VarA3;
        this.viewState = a((InterfaceC43160i<? extends InterfaceC43160i>) C43175k.I(K.f411877a, new B1(new InterfaceC43160i[]{n2VarA, z1A, n2VarA2, n2VarA3, z1A2}, new o(null))), (InterfaceC43160i) new e(null, null, null, false, null, null, null, 127, null));
    }

    private final CharSequence b() {
        c.C12476c strings = getStrings();
        u0 u0Var = u0.f406856a;
        return ExtensionsKt.getByPriority(strings, String.format("sns_step_%s_selector_country_placeholder", Arrays.copyOf(new Object[]{this.documentType}, 1)), String.format("sns_step_%s_selector_country_placeholder", Arrays.copyOf(new Object[]{"defaults"}, 1)));
    }

    private final CharSequence c() {
        c.C12476c strings = getStrings();
        u0 u0Var = u0.f406856a;
        return ExtensionsKt.getByPriority(strings, String.format("sns_step_%s_selector_country_prompt", Arrays.copyOf(new Object[]{this.documentType}, 1)), String.format("sns_step_%s_selector_country_prompt", Arrays.copyOf(new Object[]{"defaults"}, 1)));
    }

    private final CharSequence d() {
        c.C12476c strings = getStrings();
        u0 u0Var = u0.f406856a;
        return ExtensionsKt.getByPriority(strings, String.format("sns_step_%s_selector_iddoc_prompt", Arrays.copyOf(new Object[]{this.documentType}, 1)), String.format("sns_step_%s_selector_iddoc_prompt", Arrays.copyOf(new Object[]{"defaults"}, 1)));
    }

    private final CharSequence e() {
        c.C12476c strings = getStrings();
        u0 u0Var = u0.f406856a;
        return ExtensionsKt.getByPriority(strings, String.format("sns_step_%s_selector_footerHtml", Arrays.copyOf(new Object[]{this.documentType}, 1)), String.format("sns_step_%s_selector_footerHtml", Arrays.copyOf(new Object[]{"defaults"}, 1)));
    }

    private final CharSequence f() {
        c.C12476c strings = getStrings();
        u0 u0Var = u0.f406856a;
        return ExtensionsKt.getByPriority(strings, String.format("sns_step_%s_selector_iddoc_listIsEmpty", Arrays.copyOf(new Object[]{this.documentType}, 1)), String.format("sns_step_%s_selector_iddoc_listIsEmpty", Arrays.copyOf(new Object[]{"defaults"}, 1)));
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public n2<e> getViewState() {
        return this.viewState;
    }

    public final void h() {
        if (this.dialogState.getValue().booleanValue()) {
            this.dialogState.setValue(Boolean.FALSE);
        }
    }

    public final void i() {
        if (this.selectedDialogCountryItems.getValue().isEmpty()) {
            return;
        }
        if (this.dialogState.getValue().booleanValue()) {
            Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "onSelectCountryClick: dialog already shown", null, 4, null);
        } else {
            this.dialogState.setValue(Boolean.TRUE);
        }
    }

    public final void a(@Y61.l CBRCountryPicker.CountryItem country) {
        if (country == null || L.f(this.selectedCountry.getValue(), country)) {
            return;
        }
        this.selectedCountry.setValue(country);
        this.commonRepository.a(country.getCode());
        CBREventHandler eventHandler = n0.f432787a.getEventHandler();
        if (eventHandler != null) {
            eventHandler.onEvent(new CBREvent.CountrySelected(country.getCode(), true));
        }
    }

    /* compiled from: CBRDocumentSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006 "}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/b$f;", "", "", "countryTitleText", "documentTitleText", "footerText", "infoText", "countryPlaceholder", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/CharSequence;", "g", "()Ljava/lang/CharSequence;", "b", "h", "c", "i", "d", "j", "e", "f", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence countryTitleText;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence documentTitleText;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence footerText;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence infoText;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence countryPlaceholder;

        public f(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l CharSequence charSequence3, @Y61.l CharSequence charSequence4, @Y61.l CharSequence charSequence5) {
            this.countryTitleText = charSequence;
            this.documentTitleText = charSequence2;
            this.footerText = charSequence3;
            this.infoText = charSequence4;
            this.countryPlaceholder = charSequence5;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return L.f(this.countryTitleText, fVar.countryTitleText) && L.f(this.documentTitleText, fVar.documentTitleText) && L.f(this.footerText, fVar.footerText) && L.f(this.infoText, fVar.infoText) && L.f(this.countryPlaceholder, fVar.countryPlaceholder);
        }

        @Y61.l
        /* renamed from: f, reason: from getter */
        public final CharSequence getCountryPlaceholder() {
            return this.countryPlaceholder;
        }

        @Y61.l
        /* renamed from: g, reason: from getter */
        public final CharSequence getCountryTitleText() {
            return this.countryTitleText;
        }

        @Y61.l
        /* renamed from: h, reason: from getter */
        public final CharSequence getDocumentTitleText() {
            return this.documentTitleText;
        }

        public int hashCode() {
            CharSequence charSequence = this.countryTitleText;
            int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.documentTitleText;
            int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.footerText;
            int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            CharSequence charSequence4 = this.infoText;
            int iHashCode4 = (iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
            CharSequence charSequence5 = this.countryPlaceholder;
            return iHashCode4 + (charSequence5 != null ? charSequence5.hashCode() : 0);
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final CharSequence getFooterText() {
            return this.footerText;
        }

        @Y61.l
        /* renamed from: j, reason: from getter */
        public final CharSequence getInfoText() {
            return this.infoText;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewText(countryTitleText=");
            sb2.append((Object) this.countryTitleText);
            sb2.append(", documentTitleText=");
            sb2.append((Object) this.documentTitleText);
            sb2.append(", footerText=");
            sb2.append((Object) this.footerText);
            sb2.append(", infoText=");
            sb2.append((Object) this.infoText);
            sb2.append(", countryPlaceholder=");
            return AK.c.r(sb2, this.countryPlaceholder, ')');
        }

        public /* synthetic */ f(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : charSequence, (i12 & 2) != 0 ? null : charSequence2, (i12 & 4) != 0 ? null : charSequence3, (i12 & 8) != 0 ? null : charSequence4, charSequence5);
        }
    }

    public final void a(@Y61.k r document) {
        String currentCountryKey = this.documents.getValue().getCurrentCountryKey();
        if (currentCountryKey != null) {
            CBREventHandler eventHandler = n0.f432787a.getEventHandler();
            if (eventHandler != null) {
                eventHandler.onEvent(new CBREvent.DocumentTypeSelected(currentCountryKey, document.getValue()));
            }
            fireEvent(new d(currentCountryKey, document));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f a() {
        return new f(c(), d(), this.extensionProvider.a(e()), this.extensionProvider.a(f()), b());
    }

    private final <T> n2<T> a(InterfaceC43160i<? extends T> interfaceC43160i, T t12) {
        return C43175k.U(interfaceC43160i, N0.a(this), i2.a.b(i2.f411430a, 0L, 3), t12);
    }
}
