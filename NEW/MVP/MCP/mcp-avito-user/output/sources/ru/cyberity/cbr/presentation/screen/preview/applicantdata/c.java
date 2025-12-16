package ru.cyberity.cbr.presentation.screen.preview.applicantdata;

import Y41.p;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.view.C23060r0;
import androidx.view.N0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.common.y0;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.FieldName;
import ru.cyberity.cbr.core.data.model.g;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.data.model.p;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.form.HostViewModel;
import ru.cyberity.cbr.core.presentation.form.ItemValueCache;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.presentation.form.model.FormItemExtensionsKt;
import ru.cyberity.cbr.presentation.screen.preview.b;
import ru.cyberity.log.LoggerType;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRApplicantDataDocumentViewModel.kt */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00035U`B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0018H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010!\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J'\u0010\u0019\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010'J\u0017\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0018¢\u0006\u0004\b,\u0010-J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u0019\u0010.J\u000f\u0010/\u001a\u00020\u0018H\u0002¢\u0006\u0004\b/\u0010-J%\u0010\u0019\u001a\u00020\u00182\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u00103J#\u00105\u001a\u00020\u0016*\u0002042\u0006\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b5\u00106J#\u0010\u0019\u001a\u00020\u0016*\u0002042\u0006\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u0019\u00106J\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001f*\u00020#2\u0006\u0010\u001e\u001a\u000207H\u0002¢\u0006\u0004\b\u0019\u00108J\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001f*\u00020#2\u0006\u0010\u001e\u001a\u000209H\u0002¢\u0006\u0004\b\u0019\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010;R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010N\u001a\u00020I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MRC\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0O2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0O8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020E0X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0016\u0010_\u001a\u0004\u0018\u00010\\8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006a"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c;", "Lru/cyberity/cbr/presentation/screen/preview/b;", "Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c$d;", "Lru/cyberity/cbr/core/presentation/form/HostViewModel;", "Lru/cyberity/cbr/core/data/model/Document;", "document", "Landroidx/lifecycle/r0;", "savedStateHandle", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/cbr/domain/k;", "uploadApplicantDataUseCase", "Lru/cyberity/cbr/core/domain/b;", "countriesUseCase", "Lru/cyberity/cbr/core/common/y0;", "tinValidator", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;Landroidx/lifecycle/r0;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;Lru/cyberity/cbr/domain/k;Lru/cyberity/cbr/core/domain/b;Lru/cyberity/cbr/core/common/y0;)V", "j", "()Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c$d;", "", "show", "Lkotlin/G0;", "a", "(Z)V", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "field", "", "value", "onFieldValueChanged", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;Ljava/lang/String;)V", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "Lru/cyberity/cbr/core/data/model/e;", Navigation.CONFIG, "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/p;", "error", "onHandleError", "(Lru/cyberity/cbr/core/data/model/p;)V", "n", "()V", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;)V", "m", "", "Lru/cyberity/cbr/domain/b;", "errors", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/h;", "b", "(Lru/cyberity/cbr/core/data/model/h;Lru/cyberity/cbr/core/data/model/g;Ljava/lang/String;)Z", "Lru/cyberity/cbr/core/data/model/h$d;", "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/h$d;)Ljava/lang/String;", "Lru/cyberity/cbr/core/data/model/h$c;", "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/h$c;)Ljava/lang/String;", "Lru/cyberity/cbr/domain/k;", "Lru/cyberity/cbr/core/common/y0;", "Lru/cyberity/cbr/domain/c;", "o", "Lru/cyberity/cbr/domain/c;", "resources", "p", "Z", "allowCountryStateDropdownBecomeAutoRequired", "Lkotlinx/coroutines/flow/Z1;", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$FormViewState;", "q", "Lkotlinx/coroutines/flow/Z1;", "_formViewState", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "r", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "getItemValueCache", "()Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "itemValueCache", "", "<set-?>", "s", "Lru/cyberity/cbr/core/presentation/screen/base/a;", "l", "()Ljava/util/Map;", "c", "(Ljava/util/Map;)V", "fieldValueCache", "Lkotlinx/coroutines/flow/n2;", "getFormViewState", "()Lkotlinx/coroutines/flow/n2;", "formViewState", "Lru/cyberity/cbr/core/data/model/g$c$a;", "k", "()Lru/cyberity/cbr/core/data/model/g$c$a;", "docSet", "d", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c extends ru.cyberity.cbr.presentation.screen.preview.b<d> implements HostViewModel {

    /* renamed from: t, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f434741t = {m0.f406844a.e(new Y(c.class, "fieldValueCache", "getFieldValueCache()Ljava/util/Map;", 0))};

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.domain.k uploadApplicantDataUseCase;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final y0 tinValidator;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private ru.cyberity.cbr.domain.c resources;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean allowCountryStateDropdownBecomeAutoRequired;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Z1<HostViewModel.FormViewState> _formViewState;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ItemValueCache itemValueCache;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a fieldValueCache;

    /* compiled from: CBRApplicantDataDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c$d;", VoiceInfo.STATE, "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c$d;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.applicantdata.CBRApplicantDataDocumentViewModel$1", f = "CBRApplicantDataDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<d, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434749a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f434750b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super G0> continuation) {
            return ((a) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f434750b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f434749a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            d dVar = (d) this.f434750b;
            Z1 z12 = c.this._formViewState;
            CharSequence title = dVar.getTitle();
            String string = title != null ? title.toString() : null;
            CharSequence subtitle = dVar.getSubtitle();
            z12.setValue(new HostViewModel.FormViewState(0, Collections.singletonList(new HostViewModel.Page(0, string, subtitle != null ? subtitle.toString() : null, dVar.l())), null, new HostViewModel.ValidationStrings(null, null, 3, null)));
            return G0.f406611a;
        }
    }

    /* compiled from: CBRApplicantDataDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c$b;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "a", "Ljava/lang/CharSequence;", "c", "()Ljava/lang/CharSequence;", "message", "b", "d", "positiveButton", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class b implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence message;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence positiveButton;

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final CharSequence getMessage() {
            return this.message;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final CharSequence getPositiveButton() {
            return this.positiveButton;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return L.f(this.message, bVar.message) && L.f(this.positiveButton, bVar.positiveButton);
        }

        public int hashCode() {
            CharSequence charSequence = this.message;
            int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.positiveButton;
            return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorEvent(message=");
            sb2.append((Object) this.message);
            sb2.append(", positiveButton=");
            return AK.c.r(sb2, this.positiveButton, ')');
        }
    }

    /* compiled from: CBRApplicantDataDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c$c;", "Lru/cyberity/cbr/presentation/screen/preview/b$d;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.preview.applicantdata.c$c, reason: collision with other inner class name */
    public static final class C12517c extends b.d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C12517c f434754a = new C12517c();

        private C12517c() {
        }
    }

    /* compiled from: CBRApplicantDataDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Jt\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c$d;", "Lru/cyberity/cbr/presentation/screen/preview/b$a;", "Lru/cyberity/cbr/domain/c;", "resources", "", "Lru/cyberity/cbr/domain/b;", "errors", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "formItems", "", "currentCountry", "", "title", "subtitle", "buttonContinue", "", "showContent", "<init>", "(Lru/cyberity/cbr/domain/c;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V", "a", "(Lru/cyberity/cbr/domain/c;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/domain/c;", "m", "()Lru/cyberity/cbr/domain/c;", "b", "Ljava/util/List;", "k", "()Ljava/util/List;", "c", "l", "d", "Ljava/lang/String;", "j", "e", "Ljava/lang/CharSequence;", "p", "()Ljava/lang/CharSequence;", "f", "o", "g", "i", "h", "Z", "n", "()Z", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class d extends b.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final ru.cyberity.cbr.domain.c resources;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final List<ru.cyberity.cbr.domain.b> errors;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final List<FormItem> formItems;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String currentCountry;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence title;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence subtitle;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence buttonContinue;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final boolean showContent;

        public d() {
            this(null, null, null, null, null, null, null, false, 255, null);
        }

        @Y61.k
        public final d a(@Y61.k ru.cyberity.cbr.domain.c resources, @Y61.k List<ru.cyberity.cbr.domain.b> errors, @Y61.k List<? extends FormItem> formItems, @Y61.l String currentCountry, @Y61.l CharSequence title, @Y61.l CharSequence subtitle, @Y61.l CharSequence buttonContinue, boolean showContent) {
            return new d(resources, errors, formItems, currentCountry, title, subtitle, buttonContinue, showContent);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return L.f(this.resources, dVar.resources) && L.f(this.errors, dVar.errors) && L.f(this.formItems, dVar.formItems) && L.f(this.currentCountry, dVar.currentCountry) && L.f(this.title, dVar.title) && L.f(this.subtitle, dVar.subtitle) && L.f(this.buttonContinue, dVar.buttonContinue) && this.showContent == dVar.showContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iE2 = H.e(H.e(this.resources.hashCode() * 31, 31, this.errors), 31, this.formItems);
            String str = this.currentCountry;
            int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
            CharSequence charSequence = this.title;
            int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.subtitle;
            int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.buttonContinue;
            int iHashCode4 = (iHashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31;
            boolean z12 = this.showContent;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            return iHashCode4 + i12;
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final CharSequence getButtonContinue() {
            return this.buttonContinue;
        }

        @Y61.k
        public final List<FormItem> l() {
            return this.formItems;
        }

        @Y61.k
        /* renamed from: m, reason: from getter */
        public final ru.cyberity.cbr.domain.c getResources() {
            return this.resources;
        }

        /* renamed from: n, reason: from getter */
        public final boolean getShowContent() {
            return this.showContent;
        }

        @Y61.l
        /* renamed from: o, reason: from getter */
        public final CharSequence getSubtitle() {
            return this.subtitle;
        }

        @Y61.l
        /* renamed from: p, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(resources=");
            sb2.append(this.resources);
            sb2.append(", errors=");
            sb2.append(this.errors);
            sb2.append(", formItems=");
            sb2.append(this.formItems);
            sb2.append(", currentCountry=");
            sb2.append(this.currentCountry);
            sb2.append(", title=");
            sb2.append((Object) this.title);
            sb2.append(", subtitle=");
            sb2.append((Object) this.subtitle);
            sb2.append(", buttonContinue=");
            sb2.append((Object) this.buttonContinue);
            sb2.append(", showContent=");
            return r.x(sb2, this.showContent, ')');
        }

        public d(ru.cyberity.cbr.domain.c cVar, List list, List list2, String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? new ru.cyberity.cbr.domain.c(null, null, null, null, null, 31, null) : cVar, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? C42784z0.f406748b : list2, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : charSequence, (i12 & 32) != 0 ? null : charSequence2, (i12 & 64) == 0 ? charSequence3 : null, (i12 & 128) != 0 ? false : z12);
        }

        public static /* synthetic */ d a(d dVar, ru.cyberity.cbr.domain.c cVar, List list, List list2, String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z12, int i12, Object obj) {
            return dVar.a((i12 & 1) != 0 ? dVar.resources : cVar, (i12 & 2) != 0 ? dVar.errors : list, (i12 & 4) != 0 ? dVar.formItems : list2, (i12 & 8) != 0 ? dVar.currentCountry : str, (i12 & 16) != 0 ? dVar.title : charSequence, (i12 & 32) != 0 ? dVar.subtitle : charSequence2, (i12 & 64) != 0 ? dVar.buttonContinue : charSequence3, (i12 & 128) != 0 ? dVar.showContent : z12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(@Y61.k ru.cyberity.cbr.domain.c cVar, @Y61.k List<ru.cyberity.cbr.domain.b> list, @Y61.k List<? extends FormItem> list2, @Y61.l String str, @Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l CharSequence charSequence3, boolean z12) {
            this.resources = cVar;
            this.errors = list;
            this.formItems = list2;
            this.currentCountry = str;
            this.title = charSequence;
            this.subtitle = charSequence2;
            this.buttonContinue = charSequence3;
            this.showContent = z12;
        }
    }

    /* compiled from: CBRApplicantDataDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f434763a;

        static {
            int[] iArr = new int[FieldName.values().length];
            iArr[FieldName.countryOfBirth.ordinal()] = 1;
            iArr[FieldName.country.ordinal()] = 2;
            iArr[FieldName.taxResidenceCountry.ordinal()] = 3;
            iArr[FieldName.stateOfBirth.ordinal()] = 4;
            iArr[FieldName.state.ordinal()] = 5;
            iArr[FieldName.firstName.ordinal()] = 6;
            iArr[FieldName.lastName.ordinal()] = 7;
            iArr[FieldName.middleName.ordinal()] = 8;
            iArr[FieldName.tin.ordinal()] = 9;
            iArr[FieldName.phone.ordinal()] = 10;
            iArr[FieldName.placeOfBirth.ordinal()] = 11;
            iArr[FieldName.legalName.ordinal()] = 12;
            iArr[FieldName.gender.ordinal()] = 13;
            iArr[FieldName.nationality.ordinal()] = 14;
            iArr[FieldName.dob.ordinal()] = 15;
            iArr[FieldName.email.ordinal()] = 16;
            iArr[FieldName.buildingNumber.ordinal()] = 17;
            iArr[FieldName.flatNumber.ordinal()] = 18;
            iArr[FieldName.postCode.ordinal()] = 19;
            iArr[FieldName.street.ordinal()] = 20;
            iArr[FieldName.subStreet.ordinal()] = 21;
            iArr[FieldName.town.ordinal()] = 22;
            f434763a = iArr;
        }
    }

    /* compiled from: CBRApplicantDataDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"ru/cyberity/cbr/presentation/screen/preview/applicantdata/c$f", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "", "sectionId", "itemId", "valueFor", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class f implements ItemValueCache {
        public f() {
        }

        @Override // ru.cyberity.cbr.core.presentation.form.ItemValueCache
        @Y61.l
        public String valueFor(@Y61.k String sectionId, @Y61.k String itemId) {
            return (String) c.this.l().get(itemId);
        }
    }

    /* compiled from: CBRApplicantDataDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.applicantdata.CBRApplicantDataDocumentViewModel$onDataLoaded$3", f = "CBRApplicantDataDocumentViewModel.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434765a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return c.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434765a;
            if (i12 == 0) {
                C42729a0.b(obj);
                c.this.m();
                c cVar = c.this;
                this.f434765a = 1;
                if (cVar.a((List<ru.cyberity.cbr.domain.b>) null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            c.this.a(true);
            return G0.f406611a;
        }
    }

    /* compiled from: CBRApplicantDataDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.applicantdata.CBRApplicantDataDocumentViewModel$onFieldValueChanged$1", f = "CBRApplicantDataDocumentViewModel.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434767a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return c.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434767a;
            if (i12 == 0) {
                C42729a0.b(obj);
                c cVar = c.this;
                this.f434767a = 1;
                if (cVar.a((List<ru.cyberity.cbr.domain.b>) null, this) == coroutine_suspended) {
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

    /* compiled from: CBRApplicantDataDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c$d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.applicantdata.CBRApplicantDataDocumentViewModel$onPrepare$2", f = "CBRApplicantDataDocumentViewModel.kt", i = {}, l = {131, 132, 133}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements p<d, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f434769a;

        /* renamed from: b, reason: collision with root package name */
        Object f434770b;

        /* renamed from: c, reason: collision with root package name */
        int f434771c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f434772d;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super d> continuation) {
            return ((i) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            i iVar = c.this.new i(continuation);
            iVar.f434772d = obj;
            return iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.f434771c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L40
                if (r1 == r4) goto L38
                if (r1 == r3) goto L2c
                if (r1 != r2) goto L24
                java.lang.Object r0 = r12.f434770b
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.Object r1 = r12.f434769a
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r2 = r12.f434772d
                ru.cyberity.cbr.presentation.screen.preview.applicantdata.c$d r2 = (ru.cyberity.cbr.presentation.screen.preview.applicantdata.c.d) r2
                kotlin.C42729a0.b(r13)
                r6 = r0
                r5 = r1
                r0 = r2
                goto L87
            L24:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L2c:
                java.lang.Object r1 = r12.f434769a
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r3 = r12.f434772d
                ru.cyberity.cbr.presentation.screen.preview.applicantdata.c$d r3 = (ru.cyberity.cbr.presentation.screen.preview.applicantdata.c.d) r3
                kotlin.C42729a0.b(r13)
                goto L6e
            L38:
                java.lang.Object r1 = r12.f434772d
                ru.cyberity.cbr.presentation.screen.preview.applicantdata.c$d r1 = (ru.cyberity.cbr.presentation.screen.preview.applicantdata.c.d) r1
                kotlin.C42729a0.b(r13)
                goto L57
            L40:
                kotlin.C42729a0.b(r13)
                java.lang.Object r13 = r12.f434772d
                r1 = r13
                ru.cyberity.cbr.presentation.screen.preview.applicantdata.c$d r1 = (ru.cyberity.cbr.presentation.screen.preview.applicantdata.c.d) r1
                ru.cyberity.cbr.presentation.screen.preview.applicantdata.c r13 = ru.cyberity.cbr.presentation.screen.preview.applicantdata.c.this
                r12.f434772d = r1
                r12.f434771c = r4
                java.lang.String r4 = "sns_step_APPLICANT_DATA_title"
                java.lang.Object r13 = ru.cyberity.cbr.presentation.screen.preview.applicantdata.c.a(r13, r4, r12)
                if (r13 != r0) goto L57
                return r0
            L57:
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                ru.cyberity.cbr.presentation.screen.preview.applicantdata.c r4 = ru.cyberity.cbr.presentation.screen.preview.applicantdata.c.this
                r12.f434772d = r1
                r12.f434769a = r13
                r12.f434771c = r3
                java.lang.String r3 = "sns_step_APPLICANT_DATA_prompt"
                java.lang.Object r3 = ru.cyberity.cbr.presentation.screen.preview.applicantdata.c.a(r4, r3, r12)
                if (r3 != r0) goto L6a
                return r0
            L6a:
                r11 = r1
                r1 = r13
                r13 = r3
                r3 = r11
            L6e:
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                ru.cyberity.cbr.presentation.screen.preview.applicantdata.c r4 = ru.cyberity.cbr.presentation.screen.preview.applicantdata.c.this
                r12.f434772d = r3
                r12.f434769a = r1
                r12.f434770b = r13
                r12.f434771c = r2
                java.lang.String r2 = "sns_data_action_submit"
                java.lang.Object r2 = ru.cyberity.cbr.presentation.screen.preview.applicantdata.c.a(r4, r2, r12)
                if (r2 != r0) goto L83
                return r0
            L83:
                r6 = r13
                r5 = r1
                r13 = r2
                r0 = r3
            L87:
                r7 = r13
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r9 = 143(0x8f, float:2.0E-43)
                r10 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r8 = 0
                ru.cyberity.cbr.presentation.screen.preview.applicantdata.c$d r13 = ru.cyberity.cbr.presentation.screen.preview.applicantdata.c.d.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.applicantdata.c.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRApplicantDataDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.applicantdata.CBRApplicantDataDocumentViewModel$onSubmitClick$1", f = "CBRApplicantDataDocumentViewModel.kt", i = {}, l = {371}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434774a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f434775b;

        /* compiled from: CBRApplicantDataDocumentViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.applicantdata.CBRApplicantDataDocumentViewModel$onSubmitClick$1$1", f = "CBRApplicantDataDocumentViewModel.kt", i = {}, l = {372, 413, 479}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f434777a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f434778b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f434779c;

            /* compiled from: CBRApplicantDataDocumentViewModel.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c$d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.applicantdata.CBRApplicantDataDocumentViewModel$onSubmitClick$1$1$2", f = "CBRApplicantDataDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: ru.cyberity.cbr.presentation.screen.preview.applicantdata.c$j$a$a, reason: collision with other inner class name */
            public static final class C12518a extends SuspendLambda implements p<d, Continuation<? super d>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f434780a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f434781b;

                public C12518a(Continuation<? super C12518a> continuation) {
                    super(2, continuation);
                }

                @Override // Y41.p
                @Y61.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super d> continuation) {
                    return ((C12518a) create(dVar, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    C12518a c12518a = new C12518a(continuation);
                    c12518a.f434781b = obj;
                    return c12518a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f434780a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return d.a((d) this.f434781b, null, C42784z0.f406748b, null, null, null, null, null, false, 253, null);
                }
            }

            /* compiled from: CBRApplicantDataDocumentViewModel.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$d;", "it", "", "a", "(Lru/cyberity/cbr/core/data/model/h$d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
            public static final class b extends N implements Y41.l<h.d, Boolean> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ c f434782a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(c cVar) {
                    super(1);
                    this.f434782a = cVar;
                }

                @Override // Y41.l
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@Y61.k h.d dVar) {
                    Map mapL = this.f434782a.l();
                    FieldName name = dVar.getName();
                    CharSequence charSequence = (CharSequence) mapL.get(name != null ? name.getValue() : null);
                    return Boolean.valueOf(!(charSequence == null || charSequence.length() == 0));
                }
            }

            /* compiled from: CBRApplicantDataDocumentViewModel.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$d;", "it", "Lkotlin/Q;", "", "a", "(Lru/cyberity/cbr/core/data/model/h$d;)Lkotlin/Q;"}, k = 3, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.presentation.screen.preview.applicantdata.c$j$a$c, reason: collision with other inner class name */
            public static final class C12519c extends N implements Y41.l<h.d, Q<? extends String, ? extends String>> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ c f434783a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C12519c(c cVar) {
                    super(1);
                    this.f434783a = cVar;
                }

                @Override // Y41.l
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Q<String, String> invoke(@Y61.k h.d dVar) {
                    String value;
                    FieldName name = dVar.getName();
                    if (name == null || (value = name.getValue()) == null) {
                        value = "";
                    }
                    Map mapL = this.f434783a.l();
                    FieldName name2 = dVar.getName();
                    String str = (String) mapL.get(name2 != null ? name2.getValue() : null);
                    return new Q<>(value, str != null ? str : "");
                }
            }

            /* compiled from: CBRApplicantDataDocumentViewModel.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$d;", "it", "", "a", "(Lru/cyberity/cbr/core/data/model/h$d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
            public static final class d extends N implements Y41.l<h.d, Boolean> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ c f434784a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(c cVar) {
                    super(1);
                    this.f434784a = cVar;
                }

                @Override // Y41.l
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@Y61.k h.d dVar) {
                    Map mapL = this.f434784a.l();
                    FieldName name = dVar.getName();
                    CharSequence charSequence = (CharSequence) mapL.get(name != null ? name.getValue() : null);
                    return Boolean.valueOf((charSequence == null || charSequence.length() == 0 || !dVar.w()) ? false : true);
                }
            }

            /* compiled from: CBRApplicantDataDocumentViewModel.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$d;", "it", "Lkotlin/Q;", "", "a", "(Lru/cyberity/cbr/core/data/model/h$d;)Lkotlin/Q;"}, k = 3, mv = {1, 7, 1})
            public static final class e extends N implements Y41.l<h.d, Q<? extends String, ? extends String>> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ c f434785a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(c cVar) {
                    super(1);
                    this.f434785a = cVar;
                }

                @Override // Y41.l
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Q<String, String> invoke(@Y61.k h.d dVar) {
                    String value;
                    FieldName name = dVar.getName();
                    if (name == null || (value = name.getValue()) == null) {
                        value = "";
                    }
                    Map mapL = this.f434785a.l();
                    FieldName name2 = dVar.getName();
                    String str = (String) mapL.get(name2 != null ? name2.getValue() : null);
                    return new Q<>(value, str != null ? str : "");
                }
            }

            /* compiled from: CBRApplicantDataDocumentViewModel.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$c;", "it", "Lru/cyberity/cbr/core/data/model/remote/e;", "a", "(Lru/cyberity/cbr/core/data/model/h$c;)Lru/cyberity/cbr/core/data/model/remote/e;"}, k = 3, mv = {1, 7, 1})
            public static final class f extends N implements Y41.l<h.c, ru.cyberity.cbr.core.data.model.remote.e> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ c f434786a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(c cVar) {
                    super(1);
                    this.f434786a = cVar;
                }

                @Override // Y41.l
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ru.cyberity.cbr.core.data.model.remote.e invoke(@Y61.k h.c cVar) {
                    String name = cVar.getName();
                    if (name == null) {
                        name = "";
                    }
                    String str = (String) this.f434786a.l().get(cVar.getName());
                    return new ru.cyberity.cbr.core.data.model.remote.e(name, str != null ? str : "");
                }
            }

            /* compiled from: CBRApplicantDataDocumentViewModel.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$d;", "it", "", "a", "(Lru/cyberity/cbr/core/data/model/h$d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
            public static final class g extends N implements Y41.l<h.d, Boolean> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ c f434787a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ru.cyberity.cbr.core.data.model.g f434788b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(c cVar, ru.cyberity.cbr.core.data.model.g gVar) {
                    super(1);
                    this.f434787a = cVar;
                    this.f434788b = gVar;
                }

                @Override // Y41.l
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@Y61.k h.d dVar) {
                    c cVar = this.f434787a;
                    ru.cyberity.cbr.core.data.model.g gVar = this.f434788b;
                    Map mapL = cVar.l();
                    FieldName name = dVar.getName();
                    String str = (String) mapL.get(name != null ? name.getValue() : null);
                    if (str == null) {
                        str = "";
                    }
                    return Boolean.valueOf(cVar.a(dVar, gVar, str));
                }
            }

            /* compiled from: CBRApplicantDataDocumentViewModel.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$d;", "it", "", "a", "(Lru/cyberity/cbr/core/data/model/h$d;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
            public static final class h extends N implements Y41.l<h.d, String> {

                /* renamed from: a, reason: collision with root package name */
                public static final h f434789a = new h();

                public h() {
                    super(1);
                }

                @Override // Y41.l
                @Y61.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(@Y61.k h.d dVar) {
                    FieldName name = dVar.getName();
                    if (name != null) {
                        return name.getValue();
                    }
                    return null;
                }
            }

            /* compiled from: CBRApplicantDataDocumentViewModel.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$d;", "it", "", "a", "(Lru/cyberity/cbr/core/data/model/h$d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
            public static final class i extends N implements Y41.l<h.d, Boolean> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ c f434790a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ru.cyberity.cbr.core.data.model.g f434791b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i(c cVar, ru.cyberity.cbr.core.data.model.g gVar) {
                    super(1);
                    this.f434790a = cVar;
                    this.f434791b = gVar;
                }

                @Override // Y41.l
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@Y61.k h.d dVar) {
                    c cVar = this.f434790a;
                    ru.cyberity.cbr.core.data.model.g gVar = this.f434791b;
                    Map mapL = cVar.l();
                    FieldName name = dVar.getName();
                    String str = (String) mapL.get(name != null ? name.getValue() : null);
                    if (str == null) {
                        str = "";
                    }
                    return Boolean.valueOf(cVar.b(dVar, gVar, str));
                }
            }

            /* compiled from: CBRApplicantDataDocumentViewModel.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$d;", "it", "", "a", "(Lru/cyberity/cbr/core/data/model/h$d;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.presentation.screen.preview.applicantdata.c$j$a$j, reason: collision with other inner class name */
            public static final class C12520j extends N implements Y41.l<h.d, String> {

                /* renamed from: a, reason: collision with root package name */
                public static final C12520j f434792a = new C12520j();

                public C12520j() {
                    super(1);
                }

                @Override // Y41.l
                @Y61.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(@Y61.k h.d dVar) {
                    FieldName name = dVar.getName();
                    if (name != null) {
                        return name.getValue();
                    }
                    return null;
                }
            }

            /* compiled from: CBRApplicantDataDocumentViewModel.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "key", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
            public static final class k extends N implements Y41.l<String, String> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ c f434793a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public k(c cVar) {
                    super(1);
                    this.f434793a = cVar;
                }

                @Override // Y41.l
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(@Y61.l String str) {
                    String str2 = (String) this.f434793a.l().get(str);
                    return str2 == null ? "" : str2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, T t12, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f434778b = cVar;
                this.f434779c = t12;
            }

            @Override // Y41.l
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.l Continuation<? super G0> continuation) {
                return ((a) create(continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
                return new a(this.f434778b, this.f434779c, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:97:0x02c8  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x02da  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r21) {
                /*
                    Method dump skipped, instructions count: 766
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.applicantdata.c.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            j jVar = c.this.new j(continuation);
            jVar.f434775b = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434774a;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.f434775b;
                c cVar = c.this;
                a aVar = new a(cVar, t12, null);
                this.f434774a = 1;
                if (cVar.a(aVar, this) == coroutine_suspended) {
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

    /* compiled from: CBRApplicantDataDocumentViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.applicantdata.CBRApplicantDataDocumentViewModel", f = "CBRApplicantDataDocumentViewModel.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, l = {321, 327, 334, 336}, m = "reloadFields", n = {"this", "errors", "applicant", "formItems", "actualFieldValues", "customField", "this", "errors", "applicant", "formItems", "actualFieldValues", "customField", "this", "errors", "applicant", "formItems", "actualFieldValues", "customField", "this", "errors", "applicant", "formItems", "actualFieldValues", "customField"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6"})
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434794a;

        /* renamed from: b, reason: collision with root package name */
        Object f434795b;

        /* renamed from: c, reason: collision with root package name */
        Object f434796c;

        /* renamed from: d, reason: collision with root package name */
        Object f434797d;

        /* renamed from: e, reason: collision with root package name */
        Object f434798e;

        /* renamed from: f, reason: collision with root package name */
        Object f434799f;

        /* renamed from: g, reason: collision with root package name */
        Object f434800g;

        /* renamed from: h, reason: collision with root package name */
        Object f434801h;

        /* renamed from: i, reason: collision with root package name */
        Object f434802i;

        /* renamed from: j, reason: collision with root package name */
        Object f434803j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f434804k;

        /* renamed from: m, reason: collision with root package name */
        int f434806m;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434804k = obj;
            this.f434806m |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.a((List<ru.cyberity.cbr.domain.b>) null, this);
        }
    }

    /* compiled from: CBRApplicantDataDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c$d;", VoiceInfo.STATE, "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.applicantdata.CBRApplicantDataDocumentViewModel$reloadFields$4", f = "CBRApplicantDataDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements p<d, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434807a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f434808b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<FormItem> f434810d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List<FormItem> list, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f434810d = list;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super d> continuation) {
            return ((l) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            l lVar = c.this.new l(this.f434810d, continuation);
            lVar.f434808b = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f434807a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            d dVar = (d) this.f434808b;
            ru.cyberity.cbr.domain.c cVar = c.this.resources;
            return d.a(dVar, cVar == null ? new ru.cyberity.cbr.domain.c(null, null, null, null, null, 31, null) : cVar, null, this.f434810d, c.this.d(), null, null, null, false, 242, null);
        }
    }

    /* compiled from: CBRApplicantDataDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/FieldName;", "fieldname", "", "a", "(Lru/cyberity/cbr/core/data/model/FieldName;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class m extends N implements Y41.l<FieldName, String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f434811a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Map<String, String> map) {
            super(1);
            this.f434811a = map;
        }

        @Override // Y41.l
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@Y61.k FieldName fieldName) {
            return this.f434811a.get(fieldName.getValue());
        }
    }

    /* compiled from: CBRApplicantDataDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c$d;", VoiceInfo.STATE, "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.applicantdata.CBRApplicantDataDocumentViewModel$resetCurrentFieldError$1", f = "CBRApplicantDataDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements p<d, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434812a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f434813b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FormItem f434814c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(FormItem formItem, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f434814c = formItem;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super d> continuation) {
            return ((n) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            n nVar = new n(this.f434814c, continuation);
            nVar.f434813b = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f434812a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            d dVar = (d) this.f434813b;
            List<FormItem> listL = dVar.l();
            FormItem formItem = this.f434814c;
            ArrayList arrayList = new ArrayList(C42745f0.q(listL, 10));
            for (FormItem formItem2 : listL) {
                FormItem formItemCopyWithError = !L.f(ru.cyberity.cbr.presentation.screen.questionnary.model.c.a(formItem2), ru.cyberity.cbr.presentation.screen.questionnary.model.c.a(formItem)) ? formItem2 : null;
                if (formItemCopyWithError == null) {
                    formItemCopyWithError = FormItemExtensionsKt.copyWithError(formItem2, null);
                }
                arrayList.add(formItemCopyWithError);
            }
            return d.a(dVar, null, null, arrayList, null, null, null, null, false, 251, null);
        }
    }

    /* compiled from: CBRApplicantDataDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c$d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.applicantdata.CBRApplicantDataDocumentViewModel$showContent$1", f = "CBRApplicantDataDocumentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements p<d, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434815a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f434816b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f434817c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(boolean z12, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f434817c = z12;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super d> continuation) {
            return ((o) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            o oVar = new o(this.f434817c, continuation);
            oVar.f434816b = obj;
            return oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f434815a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return d.a((d) this.f434816b, null, null, null, null, null, null, null, this.f434817c, 127, null);
        }
    }

    public c(@Y61.k Document document, @Y61.k C23060r0 c23060r0, @Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @Y61.k ru.cyberity.cbr.domain.k kVar, @Y61.k ru.cyberity.cbr.core.domain.b bVar, @Y61.k y0 y0Var) {
        super(document, c23060r0, aVar, cVar, bVar);
        this.uploadApplicantDataUseCase = kVar;
        this.tinValidator = y0Var;
        this.allowCountryStateDropdownBecomeAutoRequired = ru.cyberity.ff.a.f435638a.b().g();
        this._formViewState = p2.a(new HostViewModel.FormViewState(0, C42784z0.f406748b, null, new HostViewModel.ValidationStrings(null, null, 3, null)));
        this.itemValueCache = new f();
        this.fieldValueCache = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "KEY_FIELD_CACHE", P0.c());
        j0.b(getViewState(), N0.a(this), new a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> l() {
        return (Map) this.fieldValueCache.a(this, f434741t[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        ru.cyberity.cbr.core.data.model.g applicant;
        ru.cyberity.cbr.domain.c cVar = this.resources;
        if (cVar == null || (applicant = cVar.getApplicant()) == null) {
            return;
        }
        g.c.a aVarK = k();
        if (aVarK == null) {
            CBRViewModel.finish$default(this, new a0.b(false, 1, null), null, null, 6, null);
            return;
        }
        List<h.d> listL = aVarK.l();
        if (listL != null && l().isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(l());
            for (h.d dVar : listL) {
                String strA = a(applicant, dVar);
                if (strA != null) {
                    linkedHashMap.put(dVar.b(), strA);
                }
            }
            c(linkedHashMap);
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.form.HostViewModel
    @Y61.k
    public n2<HostViewModel.FormViewState> getFormViewState() {
        return this._formViewState;
    }

    @Override // ru.cyberity.cbr.core.presentation.form.HostViewModel
    @Y61.k
    public ItemValueCache getItemValueCache() {
        return this.itemValueCache;
    }

    public final void n() {
        Logger.v$default(ru.cyberity.log.a.f436064a, "AppData", "submitApplicantData", null, 4, null);
        C43259k.d(N0.a(this), null, null, new j(null), 3);
    }

    @Override // ru.cyberity.cbr.core.presentation.form.HostViewModel
    public void onFieldValueChanged(@Y61.k FormItem field, @Y61.l String value) {
        Logger.v$default(ru.cyberity.log.a.f436064a, "AppData", "onFieldValueChanged: " + field.toShortString() + " -> " + value, null, 4, null);
        Map<String, String> mapL = l();
        String id2 = field.getItem().getId();
        if (id2 == null) {
            id2 = "";
        }
        c(s.a(mapL, id2, value));
        int i12 = e.f434763a[FieldName.INSTANCE.a(field.getItem().getId()).ordinal()];
        if (i12 == 1) {
            c(s.a(l(), FieldName.stateOfBirth.getValue(), (Object) null));
        } else if (i12 == 2) {
            c(s.a(l(), FieldName.state.getValue(), (Object) null));
        } else {
            if (i12 != 3) {
                a(field);
                return;
            }
            c(s.a(l(), FieldName.tin.getValue(), (Object) null));
        }
        C43259k.d(N0.a(this), null, null, new h(null), 3);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    public void onHandleError(@Y61.k ru.cyberity.cbr.core.data.model.p error) {
        if ((error instanceof p.b) && (error.getPayload() instanceof C12517c)) {
            n();
        } else {
            super.onHandleError(error);
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.l
    public Object onPrepare(@Y61.k Continuation<? super G0> continuation) {
        CBRViewModel.updateState$default(this, false, new i(null), 1, null);
        onLoad();
        return G0.f406611a;
    }

    private final void c(Map<String, String> map) {
        this.fieldValueCache.a(this, f434741t[0], map);
    }

    private final g.c.a k() {
        ru.cyberity.cbr.core.data.model.g applicant;
        ru.cyberity.cbr.domain.c cVar = this.resources;
        if (cVar == null || (applicant = cVar.getApplicant()) == null) {
            return null;
        }
        return ru.cyberity.cbr.presentation.screen.preview.applicantdata.e.b(applicant, getDocument().getType());
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public d getDefaultState() {
        return new d(null, null, null, null, null, null, null, false, 255, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(ru.cyberity.cbr.core.data.model.h hVar, ru.cyberity.cbr.core.data.model.g gVar, String str) {
        String strA;
        h.d dVar = hVar instanceof h.d ? (h.d) hVar : null;
        return dVar != null && dVar.z() && str.length() == 0 && (strA = a(gVar, dVar)) != null && strA.length() > 0;
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.b
    public void a(boolean show) {
        CBRViewModel.updateState$default(this, false, new o(show, null), 1, null);
    }

    private final void a(FormItem field) {
        CharSequence error;
        HostViewModel.Page currentPage = this._formViewState.getValue().getCurrentPage();
        if (currentPage == null) {
            return;
        }
        List<FormItem> items = currentPage.getItems();
        if ((items instanceof Collection) && items.isEmpty()) {
            return;
        }
        for (FormItem formItem : items) {
            if (L.f(ru.cyberity.cbr.presentation.screen.questionnary.model.c.a(formItem), ru.cyberity.cbr.presentation.screen.questionnary.model.c.a(field)) && (error = formItem.getError()) != null && error.length() != 0) {
                Logger.v$default(ru.cyberity.log.a.f436064a, "AppData", "reseting field error: " + ru.cyberity.cbr.presentation.screen.questionnary.model.c.a(field), null, 4, null);
                CBRViewModel.updateState$default(this, false, new n(field, null), 1, null);
                return;
            }
        }
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.b
    @Y61.l
    public Object a(@Y61.l ru.cyberity.cbr.core.data.model.g gVar, @Y61.l ru.cyberity.cbr.core.data.model.e eVar, @Y61.k Continuation<? super G0> continuation) {
        Map<String, String> mapC;
        Map<String, Map<String, String>> mapC2;
        Map<String, ru.cyberity.cbr.core.data.model.remote.n> mapD;
        if (eVar != null && (mapD = eVar.D()) != null) {
            this.tinValidator.a(mapD);
        }
        if (gVar == null) {
            Logger.e$default(ru.cyberity.log.a.f436064a.a(LoggerType.KIBANA), ru.cyberity.log.c.a(this), "onDataLoaded: applicant null!", null, 4, null);
            return G0.f406611a;
        }
        Map<String, String> mapC3 = c();
        if (mapC3 == null) {
            mapC3 = P0.c();
        }
        Map<String, String> map = mapC3;
        if (eVar == null || (mapC = ru.cyberity.cbr.core.data.model.f.k(eVar)) == null) {
            mapC = P0.c();
        }
        Map<String, String> map2 = mapC;
        if (eVar == null || (mapC2 = eVar.u()) == null) {
            mapC2 = P0.c();
        }
        this.resources = new ru.cyberity.cbr.domain.c(gVar, eVar, map2, map, mapC2);
        C43259k.d(N0.a(this), null, null, new g(null), 3);
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:167:0x035d, B:170:0x0365], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:194:0x045d, B:204:0x0485], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:204:0x0485, B:194:0x045d], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:83:0x01df, B:77:0x01d3], limit reached: 228 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x039e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r12v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x041b -> B:188:0x041e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List<ru.cyberity.cbr.domain.b> r39, kotlin.coroutines.Continuation<? super kotlin.G0> r40) {
        /*
            Method dump skipped, instructions count: 1221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.applicantdata.c.a(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(ru.cyberity.cbr.core.data.model.h hVar, ru.cyberity.cbr.core.data.model.g gVar, String str) {
        String strA;
        h.d dVar = hVar instanceof h.d ? (h.d) hVar : null;
        return dVar != null && dVar.x() && str.length() == 0 && (strA = a(gVar, dVar)) != null && strA.length() > 0;
    }

    private final String a(ru.cyberity.cbr.core.data.model.g gVar, h.d dVar) {
        List<Map<String, String>> listN;
        Map map;
        FieldName name = dVar.getName();
        int i12 = name == null ? -1 : e.f434763a[name.ordinal()];
        if (i12 != 1) {
            switch (i12) {
                case 4:
                    g.a aVar = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                    if (aVar != null) {
                        return aVar.getStateOfBirth();
                    }
                    return null;
                case 5:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    g.a aVar2 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                    if (aVar2 == null || (listN = aVar2.n()) == null || (map = (Map) C42745f0.G(listN)) == null) {
                        return null;
                    }
                    FieldName name2 = dVar.getName();
                    return (String) map.get(name2 != null ? name2.getValue() : null);
                case 6:
                    g.a aVar3 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                    if (aVar3 != null) {
                        return aVar3.getFirstName();
                    }
                    return null;
                case 7:
                    g.a aVar4 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                    if (aVar4 != null) {
                        return aVar4.getLastName();
                    }
                    return null;
                case 8:
                    g.a aVar5 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                    if (aVar5 != null) {
                        return aVar5.getMiddleName();
                    }
                    return null;
                case 9:
                    g.a aVar6 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                    if (aVar6 != null) {
                        return aVar6.getTin();
                    }
                    return null;
                case 10:
                    return gVar.getPhone();
                case 11:
                    g.a aVar7 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                    if (aVar7 != null) {
                        return aVar7.getPlaceOfBirth();
                    }
                    return null;
                case 12:
                    g.a aVar8 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                    if (aVar8 != null) {
                        return aVar8.getLegalName();
                    }
                    return null;
                case 13:
                    g.a aVar9 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                    if (aVar9 != null) {
                        return aVar9.getGender();
                    }
                    return null;
                case 14:
                    g.a aVar10 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                    if (aVar10 != null) {
                        return aVar10.getNationality();
                    }
                    return null;
                case 15:
                    g.a aVar11 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                    if (aVar11 != null) {
                        return aVar11.getDob();
                    }
                    return null;
                case 16:
                    return gVar.getEmail();
                default:
                    return null;
            }
        }
        g.a aVar12 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
        if (aVar12 != null) {
            return aVar12.getCountryOfBirth();
        }
        return null;
    }

    private final String a(ru.cyberity.cbr.core.data.model.g gVar, h.c cVar) {
        Object next;
        List<g.b> listF = gVar.F();
        if (listF == null) {
            return null;
        }
        Iterator<T> it = listF.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((g.b) next).getKey(), cVar.getName())) {
                break;
            }
        }
        g.b bVar = (g.b) next;
        if (bVar != null) {
            return bVar.getValue();
        }
        return null;
    }
}
