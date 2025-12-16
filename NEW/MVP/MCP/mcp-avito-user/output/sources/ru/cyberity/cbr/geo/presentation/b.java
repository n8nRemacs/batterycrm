package ru.cyberity.cbr.geo.presentation;

import Y41.p;
import android.location.Location;
import androidx.view.C23060r0;
import androidx.view.N0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import ru.cyberity.cbr.core.analytics.Action;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.FieldName;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.form.HostViewModel;
import ru.cyberity.cbr.core.presentation.form.ItemValueCache;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.geo.presentation.d;

/* compiled from: CBRGeoViewModel.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aBG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u001cH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020\u001c2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0$H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001cH\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001cH\u0000¢\u0006\u0004\b*\u0010)J\u0019\u0010&\u001a\u00020\u001c2\b\u0010,\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b&\u0010-J\u0015\u0010&\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b&\u00100J\r\u00101\u001a\u00020\u001c¢\u0006\u0004\b1\u0010)J\r\u00102\u001a\u00020\u001c¢\u0006\u0004\b2\u0010)J\u0013\u0010&\u001a\u000203H\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001eJ\u0013\u0010\u001a\u001a\u000204H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00109R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010:R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010;R\u001a\u0010@\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010=\u001a\u0004\b>\u0010?R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00160A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b7\u0010DR7\u0010M\u001a\b\u0012\u0004\u0012\u00020G0F2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0F8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\b&\u0010K\"\u0004\b&\u0010LR\u0016\u0010P\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020U0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020U0Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006^"}, d2 = {"Lru/cyberity/cbr/geo/presentation/b;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/geo/presentation/d;", "Lru/cyberity/cbr/core/presentation/form/HostViewModel;", "Landroidx/lifecycle/r0;", "saveStateHandle", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/cbr/geo/domain/b;", "getLocationUseCase", "Lru/cyberity/cbr/geo/domain/c;", "sendAddressUseCase", "", "skipGeolocationForm", "Lru/cyberity/cbr/core/domain/b;", "countriesUseCase", "Lru/cyberity/cbr/core/data/model/Document;", "document", "<init>", "(Landroidx/lifecycle/r0;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;Lru/cyberity/cbr/geo/domain/b;Lru/cyberity/cbr/geo/domain/c;ZLru/cyberity/cbr/core/domain/b;Lru/cyberity/cbr/core/data/model/Document;)V", "", "getDocumentType", "()Ljava/lang/String;", "Lru/cyberity/cbr/geo/presentation/d$c;", "b", "()Lru/cyberity/cbr/geo/presentation/d$c;", "Lkotlin/G0;", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "field", "value", "onFieldValueChanged", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;Ljava/lang/String;)V", "", "grantResults", "a", "(Ljava/util/Map;)V", "e", "()V", "g", "Landroid/location/Location;", "location", "(Landroid/location/Location;)V", "", "dialogId", "(I)V", "f", "d", "Lru/cyberity/cbr/geo/presentation/d$b;", "Lru/cyberity/cbr/geo/presentation/d$f;", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "Lru/cyberity/cbr/geo/domain/b;", "c", "Lru/cyberity/cbr/geo/domain/c;", "Z", "Lru/cyberity/cbr/core/domain/b;", "Lru/cyberity/cbr/core/data/model/Document;", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "getItemValueCache", "()Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "itemValueCache", "", "h", "[Ljava/lang/String;", "()[Ljava/lang/String;", "permissions", "", "Lru/cyberity/cbr/geo/model/a;", "<set-?>", "i", "Lru/cyberity/cbr/core/presentation/screen/base/a;", "()Ljava/util/List;", "(Ljava/util/List;)V", "addressDataCache", "j", "I", "attempt", "k", "Ljava/lang/String;", "idDocSetType", "Lkotlinx/coroutines/flow/Z1;", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$FormViewState;", "l", "Lkotlinx/coroutines/flow/Z1;", "_formViewState", "Lkotlinx/coroutines/flow/n2;", "getFormViewState", "()Lkotlinx/coroutines/flow/n2;", "formViewState", "m", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends CBRViewModel<ru.cyberity.cbr.geo.presentation.d> implements HostViewModel {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.geo.domain.b getLocationUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.geo.domain.c sendAddressUseCase;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean skipGeolocationForm;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.domain.b countriesUseCase;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Document document;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ItemValueCache itemValueCache;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String[] permissions;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a addressDataCache;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int attempt;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String idDocSetType;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Z1<HostViewModel.FormViewState> _formViewState;

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f434462n = {m0.f406844a.e(new Y(b.class, "addressDataCache", "getAddressDataCache()Ljava/util/List;", 0))};

    /* compiled from: CBRGeoViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d;", "it", "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/geo/presentation/d;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$1", f = "CBRGeoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<ru.cyberity.cbr.geo.presentation.d, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434475a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f434476b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k ru.cyberity.cbr.geo.presentation.d dVar, @Y61.l Continuation<? super G0> continuation) {
            return ((a) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f434476b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f434475a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            ru.cyberity.cbr.geo.presentation.d dVar = (ru.cyberity.cbr.geo.presentation.d) this.f434476b;
            if (dVar instanceof d.C12500d) {
                Z1 z12 = b.this._formViewState;
                CharSequence title = dVar.getTitle();
                String string = title != null ? title.toString() : null;
                CharSequence subtitle = dVar.getSubtitle();
                z12.setValue(new HostViewModel.FormViewState(0, Collections.singletonList(new HostViewModel.Page(0, string, subtitle != null ? subtitle.toString() : null, ((d.C12500d) dVar).g())), null, new HostViewModel.ValidationStrings(null, null, 3, null)));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBRGeoViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel", f = "CBRGeoViewModel.kt", i = {0, 1, 2, 3}, l = {82, 83, 84, 86, 87}, m = "enableLocationAccessState", n = {"this", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434478a;

        /* renamed from: b, reason: collision with root package name */
        Object f434479b;

        /* renamed from: c, reason: collision with root package name */
        Object f434480c;

        /* renamed from: d, reason: collision with root package name */
        Object f434481d;

        /* renamed from: e, reason: collision with root package name */
        Object f434482e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f434483f;

        /* renamed from: h, reason: collision with root package name */
        int f434485h;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434483f = obj;
            this.f434485h |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.a(this);
        }
    }

    /* compiled from: CBRGeoViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$handlePermissionResults$1", f = "CBRGeoViewModel.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<ru.cyberity.cbr.geo.presentation.d, Continuation<? super ru.cyberity.cbr.geo.presentation.d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434486a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k ru.cyberity.cbr.geo.presentation.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.geo.presentation.d> continuation) {
            return ((d) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434486a;
            if (i12 == 0) {
                C42729a0.b(obj);
                b bVar = b.this;
                this.f434486a = 1;
                obj = bVar.b(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: CBRGeoViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$handlePermissionResults$2", f = "CBRGeoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<ru.cyberity.cbr.geo.presentation.d, Continuation<? super ru.cyberity.cbr.geo.presentation.d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434488a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k ru.cyberity.cbr.geo.presentation.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.geo.presentation.d> continuation) {
            return ((e) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f434488a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return d.e.f434597e;
        }
    }

    /* compiled from: CBRGeoViewModel.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"ru/cyberity/cbr/geo/presentation/b$f", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "", "sectionId", "itemId", "valueFor", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class f implements ItemValueCache {
        public f() {
        }

        @Override // ru.cyberity.cbr.core.presentation.form.ItemValueCache
        @Y61.l
        public String valueFor(@Y61.k String sectionId, @Y61.k String itemId) {
            Object next;
            Iterator it = b.this.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                FieldName name = ((ru.cyberity.cbr.geo.model.a) next).getField().getName();
                if (L.f(name != null ? name.getValue() : null, itemId)) {
                    break;
                }
            }
            ru.cyberity.cbr.geo.model.a aVar = (ru.cyberity.cbr.geo.model.a) next;
            if (aVar != null) {
                return aVar.getValue();
            }
            return null;
        }
    }

    /* compiled from: CBRGeoViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$onEnableLocationAccessConfirmed$1", f = "CBRGeoViewModel.kt", i = {}, l = {454, 455, 456}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f434490a;

        /* renamed from: b, reason: collision with root package name */
        Object f434491b;

        /* renamed from: c, reason: collision with root package name */
        Object f434492c;

        /* renamed from: d, reason: collision with root package name */
        int f434493d;

        /* renamed from: e, reason: collision with root package name */
        int f434494e;

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
            return b.this.new g(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f434494e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L44
                if (r1 == r4) goto L3a
                if (r1 == r3) goto L2c
                if (r1 != r2) goto L24
                int r0 = r8.f434493d
                java.lang.Object r1 = r8.f434492c
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r2 = r8.f434491b
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.Object r3 = r8.f434490a
                ru.cyberity.cbr.geo.presentation.b r3 = (ru.cyberity.cbr.geo.presentation.b) r3
                kotlin.C42729a0.b(r9)
                goto L8f
            L24:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2c:
                int r1 = r8.f434493d
                java.lang.Object r3 = r8.f434491b
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.Object r4 = r8.f434490a
                ru.cyberity.cbr.geo.presentation.b r4 = (ru.cyberity.cbr.geo.presentation.b) r4
                kotlin.C42729a0.b(r9)
                goto L73
            L3a:
                int r4 = r8.f434493d
                java.lang.Object r1 = r8.f434490a
                ru.cyberity.cbr.geo.presentation.b r1 = (ru.cyberity.cbr.geo.presentation.b) r1
                kotlin.C42729a0.b(r9)
                goto L58
            L44:
                kotlin.C42729a0.b(r9)
                ru.cyberity.cbr.geo.presentation.b r1 = ru.cyberity.cbr.geo.presentation.b.this
                r8.f434490a = r1
                r8.f434493d = r4
                r8.f434494e = r4
                java.lang.String r9 = "sns_alert_lackOfLocationPermissions"
                java.lang.Object r9 = ru.cyberity.cbr.geo.presentation.b.a(r1, r9, r8)
                if (r9 != r0) goto L58
                return r0
            L58:
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                ru.cyberity.cbr.geo.presentation.b r5 = ru.cyberity.cbr.geo.presentation.b.this
                r8.f434490a = r1
                r8.f434491b = r9
                r8.f434493d = r4
                r8.f434494e = r3
                java.lang.String r3 = "sns_alert_action_settings"
                java.lang.Object r3 = ru.cyberity.cbr.geo.presentation.b.a(r5, r3, r8)
                if (r3 != r0) goto L6d
                return r0
            L6d:
                r6 = r3
                r3 = r9
                r9 = r6
                r7 = r4
                r4 = r1
                r1 = r7
            L73:
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                ru.cyberity.cbr.geo.presentation.b r5 = ru.cyberity.cbr.geo.presentation.b.this
                r8.f434490a = r4
                r8.f434491b = r3
                r8.f434492c = r9
                r8.f434493d = r1
                r8.f434494e = r2
                java.lang.String r2 = "sns_alert_action_cancel"
                java.lang.Object r2 = ru.cyberity.cbr.geo.presentation.b.a(r5, r2, r8)
                if (r2 != r0) goto L8a
                return r0
            L8a:
                r0 = r1
                r1 = r9
                r9 = r2
                r2 = r3
                r3 = r4
            L8f:
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                ru.cyberity.cbr.core.presentation.base.CBRViewModel$ShowPermissionDialog r4 = new ru.cyberity.cbr.core.presentation.base.CBRViewModel$ShowPermissionDialog
                r4.<init>(r0, r2, r1, r9)
                ru.cyberity.cbr.geo.presentation.b.a(r3, r4)
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.geo.presentation.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRGeoViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$onLocationDisabled$1", f = "CBRGeoViewModel.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements p<ru.cyberity.cbr.geo.presentation.d, Continuation<? super ru.cyberity.cbr.geo.presentation.d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434496a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k ru.cyberity.cbr.geo.presentation.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.geo.presentation.d> continuation) {
            return ((h) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434496a;
            if (i12 == 0) {
                C42729a0.b(obj);
                b bVar = b.this;
                this.f434496a = 1;
                obj = bVar.b(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: CBRGeoViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$onPrepare$2", f = "CBRGeoViewModel.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements p<ru.cyberity.cbr.geo.presentation.d, Continuation<? super ru.cyberity.cbr.geo.presentation.d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434498a;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k ru.cyberity.cbr.geo.presentation.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.geo.presentation.d> continuation) {
            return ((i) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434498a;
            if (i12 == 0) {
                C42729a0.b(obj);
                b bVar = b.this;
                this.f434498a = 1;
                obj = bVar.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: CBRGeoViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$onRequestLocationAccessConfirmed$1", f = "CBRGeoViewModel.kt", i = {}, l = {441, 442, 443}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f434500a;

        /* renamed from: b, reason: collision with root package name */
        Object f434501b;

        /* renamed from: c, reason: collision with root package name */
        Object f434502c;

        /* renamed from: d, reason: collision with root package name */
        int f434503d;

        /* renamed from: e, reason: collision with root package name */
        int f434504e;

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
            return b.this.new j(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x008a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f434504e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L44
                if (r1 == r4) goto L3a
                if (r1 == r3) goto L2c
                if (r1 != r2) goto L24
                int r0 = r7.f434503d
                java.lang.Object r1 = r7.f434502c
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r2 = r7.f434501b
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.Object r3 = r7.f434500a
                ru.cyberity.cbr.geo.presentation.b r3 = (ru.cyberity.cbr.geo.presentation.b) r3
                kotlin.C42729a0.b(r8)
                goto L90
            L24:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L2c:
                int r1 = r7.f434503d
                java.lang.Object r3 = r7.f434501b
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.Object r4 = r7.f434500a
                ru.cyberity.cbr.geo.presentation.b r4 = (ru.cyberity.cbr.geo.presentation.b) r4
                kotlin.C42729a0.b(r8)
                goto L74
            L3a:
                int r1 = r7.f434503d
                java.lang.Object r4 = r7.f434500a
                ru.cyberity.cbr.geo.presentation.b r4 = (ru.cyberity.cbr.geo.presentation.b) r4
                kotlin.C42729a0.b(r8)
                goto L5c
            L44:
                kotlin.C42729a0.b(r8)
                ru.cyberity.cbr.geo.presentation.b r8 = ru.cyberity.cbr.geo.presentation.b.this
                r7.f434500a = r8
                r1 = 0
                r7.f434503d = r1
                r7.f434504e = r4
                java.lang.String r4 = "sns_alert_lackOfLocationPermissions"
                java.lang.Object r4 = ru.cyberity.cbr.geo.presentation.b.a(r8, r4, r7)
                if (r4 != r0) goto L59
                return r0
            L59:
                r6 = r4
                r4 = r8
                r8 = r6
            L5c:
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                ru.cyberity.cbr.geo.presentation.b r5 = ru.cyberity.cbr.geo.presentation.b.this
                r7.f434500a = r4
                r7.f434501b = r8
                r7.f434503d = r1
                r7.f434504e = r3
                java.lang.String r3 = "sns_alert_action_settings"
                java.lang.Object r3 = ru.cyberity.cbr.geo.presentation.b.a(r5, r3, r7)
                if (r3 != r0) goto L71
                return r0
            L71:
                r6 = r3
                r3 = r8
                r8 = r6
            L74:
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                ru.cyberity.cbr.geo.presentation.b r5 = ru.cyberity.cbr.geo.presentation.b.this
                r7.f434500a = r4
                r7.f434501b = r3
                r7.f434502c = r8
                r7.f434503d = r1
                r7.f434504e = r2
                java.lang.String r2 = "sns_alert_action_cancel"
                java.lang.Object r2 = ru.cyberity.cbr.geo.presentation.b.a(r5, r2, r7)
                if (r2 != r0) goto L8b
                return r0
            L8b:
                r0 = r1
                r1 = r8
                r8 = r2
                r2 = r3
                r3 = r4
            L90:
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                ru.cyberity.cbr.core.presentation.base.CBRViewModel$ShowPermissionDialog r4 = new ru.cyberity.cbr.core.presentation.base.CBRViewModel$ShowPermissionDialog
                r4.<init>(r0, r2, r1, r8)
                ru.cyberity.cbr.geo.presentation.b.a(r3, r4)
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.geo.presentation.b.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRGeoViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$onSendAddressDataClick$1", f = "CBRGeoViewModel.kt", i = {1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4}, l = {194, 227, 230, 233, 239, 285}, m = "invokeSuspend", n = {"appConfig", "countries", "countryStates", "country", "destination$iv$iv", "addressField", "fieldName", "appConfig", "countries", "countryStates", "country", "destination$iv$iv", "addressField", "appConfig", "countries", "countryStates", "country", "destination$iv$iv", "addressField", "appConfig", "countryStates", "items"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$5", "L$7", "L$0", "L$1", "L$2", "L$3", "L$5", "L$7", "L$0", "L$1", "L$2"})
    public static final class k extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f434506a;

        /* renamed from: b, reason: collision with root package name */
        Object f434507b;

        /* renamed from: c, reason: collision with root package name */
        Object f434508c;

        /* renamed from: d, reason: collision with root package name */
        Object f434509d;

        /* renamed from: e, reason: collision with root package name */
        Object f434510e;

        /* renamed from: f, reason: collision with root package name */
        Object f434511f;

        /* renamed from: g, reason: collision with root package name */
        Object f434512g;

        /* renamed from: h, reason: collision with root package name */
        Object f434513h;

        /* renamed from: i, reason: collision with root package name */
        Object f434514i;

        /* renamed from: j, reason: collision with root package name */
        Object f434515j;

        /* renamed from: k, reason: collision with root package name */
        Object f434516k;

        /* renamed from: l, reason: collision with root package name */
        Object f434517l;

        /* renamed from: m, reason: collision with root package name */
        int f434518m;

        /* compiled from: CBRGeoViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$onSendAddressDataClick$1$1", f = "CBRGeoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<ru.cyberity.cbr.geo.presentation.d, Continuation<? super ru.cyberity.cbr.geo.presentation.d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f434520a;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k ru.cyberity.cbr.geo.presentation.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.geo.presentation.d> continuation) {
                return ((a) create(dVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f434520a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return d.c.f434593e;
            }
        }

        /* compiled from: CBRGeoViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$onSendAddressDataClick$1$3", f = "CBRGeoViewModel.kt", i = {}, l = {256, 257, 264, 265}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ru.cyberity.cbr.geo.presentation.b$k$b, reason: collision with other inner class name */
        public static final class C12498b extends SuspendLambda implements p<ru.cyberity.cbr.geo.presentation.d, Continuation<? super ru.cyberity.cbr.geo.presentation.d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f434521a;

            /* renamed from: b, reason: collision with root package name */
            Object f434522b;

            /* renamed from: c, reason: collision with root package name */
            Object f434523c;

            /* renamed from: d, reason: collision with root package name */
            Object f434524d;

            /* renamed from: e, reason: collision with root package name */
            Object f434525e;

            /* renamed from: f, reason: collision with root package name */
            Object f434526f;

            /* renamed from: g, reason: collision with root package name */
            int f434527g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ b f434528h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ List<FormItem> f434529i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ List<ru.cyberity.cbr.geo.presentation.e> f434530j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ ru.cyberity.cbr.core.data.model.e f434531k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C12498b(b bVar, List<? extends FormItem> list, List<ru.cyberity.cbr.geo.presentation.e> list2, ru.cyberity.cbr.core.data.model.e eVar, Continuation<? super C12498b> continuation) {
                super(2, continuation);
                this.f434528h = bVar;
                this.f434529i = list;
                this.f434530j = list2;
                this.f434531k = eVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k ru.cyberity.cbr.geo.presentation.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.geo.presentation.d> continuation) {
                return ((C12498b) create(dVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C12498b(this.f434528h, this.f434529i, this.f434530j, this.f434531k, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00ed A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x010d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00c6 A[SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 289
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.geo.presentation.b.k.C12498b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: CBRGeoViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$onSendAddressDataClick$1$4", f = "CBRGeoViewModel.kt", i = {}, l = {290, 291, 293}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements p<ru.cyberity.cbr.geo.presentation.d, Continuation<? super ru.cyberity.cbr.geo.presentation.d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f434532a;

            /* renamed from: b, reason: collision with root package name */
            Object f434533b;

            /* renamed from: c, reason: collision with root package name */
            Object f434534c;

            /* renamed from: d, reason: collision with root package name */
            int f434535d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f434536e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f434537f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, Object obj, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f434536e = bVar;
                this.f434537f = obj;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k ru.cyberity.cbr.geo.presentation.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.geo.presentation.d> continuation) {
                return ((c) create(dVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new c(this.f434536e, this.f434537f, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x008f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.f434535d
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L3a
                    if (r1 == r4) goto L36
                    if (r1 == r3) goto L2e
                    if (r1 != r2) goto L26
                    java.lang.Object r0 = r7.f434534c
                    ru.cyberity.cbr.core.data.model.g$a r0 = (ru.cyberity.cbr.core.data.model.g.a) r0
                    java.lang.Object r1 = r7.f434533b
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    java.lang.Object r2 = r7.f434532a
                    java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                    kotlin.C42729a0.b(r8)
                    r3 = r0
                    r6 = r2
                    r2 = r1
                    r1 = r6
                    goto L93
                L26:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L2e:
                    java.lang.Object r1 = r7.f434532a
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    kotlin.C42729a0.b(r8)
                    goto L70
                L36:
                    kotlin.C42729a0.b(r8)
                    goto L5c
                L3a:
                    kotlin.C42729a0.b(r8)
                    ru.cyberity.cbr.geo.presentation.b r8 = r7.f434536e
                    kotlin.jvm.internal.u0 r1 = kotlin.jvm.internal.u0.f406856a
                    java.lang.String r1 = r8.getDocumentType()
                    java.lang.Object[] r1 = new java.lang.Object[]{r1}
                    java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
                    java.lang.String r5 = "sns_step_%s_title"
                    java.lang.String r1 = java.lang.String.format(r5, r1)
                    r7.f434535d = r4
                    java.lang.Object r8 = ru.cyberity.cbr.geo.presentation.b.a(r8, r1, r7)
                    if (r8 != r0) goto L5c
                    return r0
                L5c:
                    java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                    ru.cyberity.cbr.geo.presentation.b r1 = r7.f434536e
                    r7.f434532a = r8
                    r7.f434535d = r3
                    java.lang.String r3 = "sns_geolocation_preview_subtitle"
                    java.lang.Object r1 = ru.cyberity.cbr.geo.presentation.b.a(r1, r3, r7)
                    if (r1 != r0) goto L6d
                    return r0
                L6d:
                    r6 = r1
                    r1 = r8
                    r8 = r6
                L70:
                    java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                    java.lang.Object r3 = r7.f434537f
                    int r4 = kotlin.Z.f406624c
                    boolean r4 = r3 instanceof kotlin.Z.b
                    if (r4 == 0) goto L7b
                    r3 = 0
                L7b:
                    ru.cyberity.cbr.core.data.model.g$a r3 = (ru.cyberity.cbr.core.data.model.g.a) r3
                    ru.cyberity.cbr.geo.presentation.b r4 = r7.f434536e
                    r7.f434532a = r1
                    r7.f434533b = r8
                    r7.f434534c = r3
                    r7.f434535d = r2
                    java.lang.String r2 = "sns_geolocation_action_continue"
                    java.lang.Object r2 = ru.cyberity.cbr.geo.presentation.b.a(r4, r2, r7)
                    if (r2 != r0) goto L90
                    return r0
                L90:
                    r6 = r2
                    r2 = r8
                    r8 = r6
                L93:
                    r4 = r8
                    java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                    ru.cyberity.cbr.geo.presentation.d$a r8 = new ru.cyberity.cbr.geo.presentation.d$a
                    r5 = 0
                    r0 = r8
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.geo.presentation.b.k.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new k(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:209:0x037f, code lost:
        
            r3 = null;
         */
        /* JADX WARN: Path cross not found for [B:102:0x0294, B:91:0x0267], limit reached: 229 */
        /* JADX WARN: Path cross not found for [B:118:0x0352, B:123:0x0368], limit reached: 229 */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0310 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0311  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0341 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0342  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0381  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0387  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x03be  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x03c0  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x03c5  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x03c8  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x04dc  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x050b  */
        /* JADX WARN: Removed duplicated region for block: B:206:0x051f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0342 -> B:116:0x034e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 1354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.geo.presentation.b.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRGeoViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel", f = "CBRGeoViewModel.kt", i = {0, 1, 2, 3}, l = {91, 92, 93, 95, 96}, m = "requestLocationAccessState", n = {"this", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434538a;

        /* renamed from: b, reason: collision with root package name */
        Object f434539b;

        /* renamed from: c, reason: collision with root package name */
        Object f434540c;

        /* renamed from: d, reason: collision with root package name */
        Object f434541d;

        /* renamed from: e, reason: collision with root package name */
        Object f434542e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f434543f;

        /* renamed from: h, reason: collision with root package name */
        int f434545h;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434543f = obj;
            this.f434545h |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.b(this);
        }
    }

    /* compiled from: CBRGeoViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$sendLocation$1", f = "CBRGeoViewModel.kt", i = {1, 2, 2, 2, 2, 3, 3, 3, 4, 4}, l = {323, 329, 339, 342, 379}, m = "invokeSuspend", n = {"appConfig", "appConfig", "addressDataCache", "destination$iv$iv", "fieldName", "appConfig", "addressDataCache", "destination$iv$iv", "appConfig", "items"}, s = {"L$0", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3", "L$0", "L$1"})
    public static final class m extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f434546a;

        /* renamed from: b, reason: collision with root package name */
        Object f434547b;

        /* renamed from: c, reason: collision with root package name */
        Object f434548c;

        /* renamed from: d, reason: collision with root package name */
        Object f434549d;

        /* renamed from: e, reason: collision with root package name */
        Object f434550e;

        /* renamed from: f, reason: collision with root package name */
        Object f434551f;

        /* renamed from: g, reason: collision with root package name */
        Object f434552g;

        /* renamed from: h, reason: collision with root package name */
        Object f434553h;

        /* renamed from: i, reason: collision with root package name */
        int f434554i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Location f434555j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ b f434556k;

        /* compiled from: CBRGeoViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$sendLocation$1$1", f = "CBRGeoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<ru.cyberity.cbr.geo.presentation.d, Continuation<? super ru.cyberity.cbr.geo.presentation.d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f434557a;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k ru.cyberity.cbr.geo.presentation.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.geo.presentation.d> continuation) {
                return ((a) create(dVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f434557a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return d.c.f434593e;
            }
        }

        /* compiled from: CBRGeoViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$sendLocation$1$3", f = "CBRGeoViewModel.kt", i = {}, l = {356, 357, 359, 360}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ru.cyberity.cbr.geo.presentation.b$m$b, reason: collision with other inner class name */
        public static final class C12499b extends SuspendLambda implements p<ru.cyberity.cbr.geo.presentation.d, Continuation<? super ru.cyberity.cbr.geo.presentation.d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f434558a;

            /* renamed from: b, reason: collision with root package name */
            Object f434559b;

            /* renamed from: c, reason: collision with root package name */
            Object f434560c;

            /* renamed from: d, reason: collision with root package name */
            Object f434561d;

            /* renamed from: e, reason: collision with root package name */
            int f434562e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f434563f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12499b(b bVar, Continuation<? super C12499b> continuation) {
                super(2, continuation);
                this.f434563f = bVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k ru.cyberity.cbr.geo.presentation.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.geo.presentation.d> continuation) {
                return ((C12499b) create(dVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C12499b(this.f434563f, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x009f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00bc A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
                /*
                    Method dump skipped, instructions count: 205
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.geo.presentation.b.m.C12499b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: CBRGeoViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$sendLocation$1$4", f = "CBRGeoViewModel.kt", i = {}, l = {369, 370, 372}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements p<ru.cyberity.cbr.geo.presentation.d, Continuation<? super ru.cyberity.cbr.geo.presentation.d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f434564a;

            /* renamed from: b, reason: collision with root package name */
            Object f434565b;

            /* renamed from: c, reason: collision with root package name */
            int f434566c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f434567d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f434567d = bVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k ru.cyberity.cbr.geo.presentation.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.geo.presentation.d> continuation) {
                return ((c) create(dVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new c(this.f434567d, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.f434566c
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L32
                    if (r1 == r4) goto L2e
                    if (r1 == r3) goto L26
                    if (r1 != r2) goto L1e
                    java.lang.Object r0 = r7.f434565b
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    java.lang.Object r1 = r7.f434564a
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    kotlin.C42729a0.b(r8)
                    r2 = r0
                    goto L7e
                L1e:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L26:
                    java.lang.Object r1 = r7.f434564a
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    kotlin.C42729a0.b(r8)
                    goto L68
                L2e:
                    kotlin.C42729a0.b(r8)
                    goto L54
                L32:
                    kotlin.C42729a0.b(r8)
                    ru.cyberity.cbr.geo.presentation.b r8 = r7.f434567d
                    kotlin.jvm.internal.u0 r1 = kotlin.jvm.internal.u0.f406856a
                    java.lang.String r1 = r8.getDocumentType()
                    java.lang.Object[] r1 = new java.lang.Object[]{r1}
                    java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
                    java.lang.String r5 = "sns_step_%s_title"
                    java.lang.String r1 = java.lang.String.format(r5, r1)
                    r7.f434566c = r4
                    java.lang.Object r8 = ru.cyberity.cbr.geo.presentation.b.a(r8, r1, r7)
                    if (r8 != r0) goto L54
                    return r0
                L54:
                    java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                    ru.cyberity.cbr.geo.presentation.b r1 = r7.f434567d
                    r7.f434564a = r8
                    r7.f434566c = r3
                    java.lang.String r3 = "sns_geolocation_preview_subtitle"
                    java.lang.Object r1 = ru.cyberity.cbr.geo.presentation.b.a(r1, r3, r7)
                    if (r1 != r0) goto L65
                    return r0
                L65:
                    r6 = r1
                    r1 = r8
                    r8 = r6
                L68:
                    java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                    ru.cyberity.cbr.geo.presentation.b r3 = r7.f434567d
                    r7.f434564a = r1
                    r7.f434565b = r8
                    r7.f434566c = r2
                    java.lang.String r2 = "sns_geolocation_action_continue"
                    java.lang.Object r2 = ru.cyberity.cbr.geo.presentation.b.a(r3, r2, r7)
                    if (r2 != r0) goto L7b
                    return r0
                L7b:
                    r6 = r2
                    r2 = r8
                    r8 = r6
                L7e:
                    r4 = r8
                    java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                    ru.cyberity.cbr.geo.presentation.d$a r8 = new ru.cyberity.cbr.geo.presentation.d$a
                    r3 = 0
                    r5 = 0
                    r0 = r8
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.geo.presentation.b.m.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: CBRGeoViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$sendLocation$1$5", f = "CBRGeoViewModel.kt", i = {}, l = {394, 395, 401}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements p<ru.cyberity.cbr.geo.presentation.d, Continuation<? super ru.cyberity.cbr.geo.presentation.d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f434568a;

            /* renamed from: b, reason: collision with root package name */
            Object f434569b;

            /* renamed from: c, reason: collision with root package name */
            Object f434570c;

            /* renamed from: d, reason: collision with root package name */
            Object f434571d;

            /* renamed from: e, reason: collision with root package name */
            Object f434572e;

            /* renamed from: f, reason: collision with root package name */
            int f434573f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ b f434574g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ List<FormItem> f434575h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ List<ru.cyberity.cbr.geo.presentation.e> f434576i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ ru.cyberity.cbr.core.data.model.e f434577j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(b bVar, List<? extends FormItem> list, List<ru.cyberity.cbr.geo.presentation.e> list2, ru.cyberity.cbr.core.data.model.e eVar, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f434574g = bVar;
                this.f434575h = list;
                this.f434576i = list2;
                this.f434577j = eVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k ru.cyberity.cbr.geo.presentation.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.geo.presentation.d> continuation) {
                return ((d) create(dVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new d(this.f434574g, this.f434575h, this.f434576i, this.f434577j, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00d2 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00a9 A[SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 229
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.geo.presentation.b.m.d.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: CBRGeoViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoViewModel$sendLocation$1$6", f = "CBRGeoViewModel.kt", i = {}, l = {410, 411, 413, 414}, m = "invokeSuspend", n = {}, s = {})
        public static final class e extends SuspendLambda implements p<ru.cyberity.cbr.geo.presentation.d, Continuation<? super ru.cyberity.cbr.geo.presentation.d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f434578a;

            /* renamed from: b, reason: collision with root package name */
            Object f434579b;

            /* renamed from: c, reason: collision with root package name */
            Object f434580c;

            /* renamed from: d, reason: collision with root package name */
            Object f434581d;

            /* renamed from: e, reason: collision with root package name */
            int f434582e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f434583f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(b bVar, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f434583f = bVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k ru.cyberity.cbr.geo.presentation.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.geo.presentation.d> continuation) {
                return ((e) create(dVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new e(this.f434583f, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x009f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00bc A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
                /*
                    Method dump skipped, instructions count: 205
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.geo.presentation.b.m.e.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Location location, b bVar, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f434555j = location;
            this.f434556k = bVar;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((m) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new m(this.f434555j, this.f434556k, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:121:0x01f1, code lost:
        
            r7 = r0;
            r0 = null;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:105:0x02e0  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01d6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01d7  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01fa  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0214  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x025f  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x028b  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x028d  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0292  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0295  */
        /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v14, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01d7 -> B:55:0x01de). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 810
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.geo.presentation.b.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(@Y61.k C23060r0 c23060r0, @Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @Y61.k ru.cyberity.cbr.geo.domain.b bVar, @Y61.k ru.cyberity.cbr.geo.domain.c cVar2, boolean z12, @Y61.k ru.cyberity.cbr.core.domain.b bVar2, @Y61.k Document document) {
        DocumentType type;
        String value;
        super(aVar, cVar);
        this.dataRepository = cVar;
        this.getLocationUseCase = bVar;
        this.sendAddressUseCase = cVar2;
        this.skipGeolocationForm = z12;
        this.countriesUseCase = bVar2;
        this.document = document;
        this.itemValueCache = new f();
        this.permissions = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.addressDataCache = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "addressDataCache", c42784z0);
        Document document2 = (Document) c23060r0.b("ARGS_DOCUMENT");
        this.idDocSetType = (document2 == null || (type = document2.getType()) == null || (value = type.getValue()) == null) ? "TYPE_UNKNOWN" : value;
        this._formViewState = p2.a(new HostViewModel.FormViewState(0, c42784z0, null, new HostViewModel.ValidationStrings(null, null, 3, null)));
        a(c42784z0);
        j0.b(getViewState(), N0.a(this), new a(null));
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.k
    public String getDocumentType() {
        return this.document.getType().getValue();
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

    @Override // ru.cyberity.cbr.core.presentation.form.HostViewModel
    public void onFieldValueChanged(@Y61.k FormItem field, @Y61.l String value) {
        ArrayList arrayList = new ArrayList(a());
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            FieldName name = ((ru.cyberity.cbr.geo.model.a) it.next()).getField().getName();
            if (L.f(name != null ? name.getValue() : null, field.getItem().getId())) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            return;
        }
        h.d field2 = ((ru.cyberity.cbr.geo.model.a) arrayList.get(i12)).getField();
        if (value == null) {
            value = "";
        }
        arrayList.set(i12, new ru.cyberity.cbr.geo.model.a(field2, value));
        a(arrayList);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.l
    public Object onPrepare(@Y61.k Continuation<? super G0> continuation) {
        this.attempt++;
        ru.cyberity.cbr.core.analytics.l.a(ru.cyberity.cbr.core.analytics.f.a(0L, 1, null).a(Action.Geolocation).l().a(new Q("attempt", Boxing.boxInt(this.attempt)), new Q("isAuthorized", Boxing.boxBoolean(false))), false, 1, null);
        CBRViewModel.updateState$default(this, false, new i(null), 1, null);
        return G0.f406611a;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String[] getPermissions() {
        return this.permissions;
    }

    public final void d() {
        C43259k.d(N0.a(this), null, null, new g(null), 3);
    }

    public final void e() {
        CBRViewModel.updateState$default(this, false, new h(null), 1, null);
    }

    public final void f() {
        C43259k.d(N0.a(this), null, null, new j(null), 3);
    }

    public final void g() {
        ru.cyberity.cbr.geo.a.a(ru.cyberity.cbr.geo.a.f434398a, "CyberityGeo", "sendAddressData: " + a(), null, 4, null);
        C43259k.d(N0.a(this), null, null, new k(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation<? super ru.cyberity.cbr.geo.presentation.d.f> r11) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.geo.presentation.b.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ru.cyberity.cbr.geo.model.a> a() {
        return (List) this.addressDataCache.a(this, f434462n[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(List<ru.cyberity.cbr.geo.model.a> list) {
        this.addressDataCache.a(this, f434462n[0], list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super ru.cyberity.cbr.geo.presentation.d.b> r11) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.geo.presentation.b.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d.c getDefaultState() {
        return d.c.f434593e;
    }

    public final void a(@Y61.k Map<String, Boolean> grantResults) {
        ru.cyberity.cbr.geo.a.a(ru.cyberity.cbr.geo.a.f434398a, "CyberityGeo", "handlePermissionResults: " + grantResults, null, 4, null);
        Boolean bool = grantResults.get("android.permission.ACCESS_COARSE_LOCATION");
        Boolean bool2 = Boolean.TRUE;
        if (!L.f(bool, bool2) && !L.f(grantResults.get("android.permission.ACCESS_FINE_LOCATION"), bool2)) {
            ru.cyberity.cbr.core.analytics.l.a(ru.cyberity.cbr.core.analytics.f.a(0L, 1, null).a(Action.Geolocation).d().a(new Q("attempt", Integer.valueOf(this.attempt)), new Q("isAuthorized", Boolean.FALSE)), false, 1, null);
            CBRViewModel.updateState$default(this, false, new d(null), 1, null);
        } else {
            CBRViewModel.updateState$default(this, false, new e(null), 1, null);
        }
    }

    public final void a(@Y61.l Location location) {
        String string;
        ru.cyberity.cbr.geo.a.a(ru.cyberity.cbr.geo.a.f434398a, "CyberityGeo", "sendLocation: " + location, null, 4, null);
        ru.cyberity.cbr.core.analytics.k kVarE = ru.cyberity.cbr.core.analytics.f.a(0L, 1, null).a(Action.Geolocation).e();
        Q q12 = new Q("attempt", Integer.valueOf(this.attempt));
        Q q13 = new Q("isAuthorized", Boolean.TRUE);
        if (location == null || (string = Float.valueOf(location.getAccuracy()).toString()) == null) {
            string = "N/A";
        }
        ru.cyberity.cbr.core.analytics.l.a(kVarE.a(q12, q13, new Q("accuracy", string), new Q("is_mock_geo", String.valueOf(location != null ? Boolean.valueOf(ru.cyberity.cbr.geo.domain.a.a(location)) : null))), false, 1, null);
        C43259k.d(N0.a(this), null, null, new m(location, this, null), 3);
    }

    public final void a(int dialogId) {
        if (dialogId == 0) {
            fireEvent(CBRViewModel.OpenAppSettings.INSTANCE);
        } else {
            fireEvent(CBRViewModel.OpenLocationSourceSettings.INSTANCE);
        }
    }
}
