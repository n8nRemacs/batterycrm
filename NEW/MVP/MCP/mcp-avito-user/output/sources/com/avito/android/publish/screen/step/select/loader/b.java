package com.avito.android.publish.screen.step.select.loader;

import Ne0.InterfaceC14567b;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.blueprints.publish.checkable.CheckableItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.SectionTitle;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectLoader.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/select/loader/b;", "Lcom/avito/android/publish/screen/step/select/loader/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.screen.step.select.loader.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.details.a f242175a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f242176b;

    /* compiled from: SelectLoader.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LNe0/b$b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.screen.step.select.loader.SelectLoaderImpl$load$1", f = "SelectLoader.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14567b.C0751b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f242177q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f242178r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f242178r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC14567b.C0751b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            SelectParameter selectParameter;
            com.avito.conveyor_item.a checkableItem;
            SelectParameter.Value.Widget.Config config;
            SelectParameter.Value.Widget.Config config2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f242177q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f242178r;
                b bVar = b.this;
                ParametersTree parametersTreeWa = bVar.f242175a.wa();
                if (parametersTreeWa == null || (selectParameter = (SelectParameter) parametersTreeWa.getFirstParameterOfType(SelectParameter.class)) == null) {
                    return G0.f406611a;
                }
                List<ParcelableEntity<String>> listToShow = selectParameter.getListToShow();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = listToShow.iterator();
                while (it.hasNext()) {
                    ParcelableEntity parcelableEntity = (ParcelableEntity) it.next();
                    if (parcelableEntity instanceof SectionTitle) {
                        checkableItem = new com.avito.android.select.title.a(((SectionTitle) parcelableEntity).getTitle());
                    } else {
                        DeepLink deepLink = null;
                        if (parcelableEntity instanceof SelectParameter.Value) {
                            String str = (String) parcelableEntity.getId();
                            SelectParameter.Value value = (SelectParameter.Value) parcelableEntity;
                            String title = value.getTitle();
                            boolean zF2 = L.f(parcelableEntity.getId(), selectParameter.getValue());
                            SelectParameter.Value.Widget widget = value.getWidget();
                            String subtitle = (widget == null || (config2 = widget.getConfig()) == null) ? null : config2.getSubtitle();
                            SelectParameter.Value.Widget widget2 = value.getWidget();
                            if (widget2 != null && (config = widget2.getConfig()) != null) {
                                deepLink = config.getDeepLink();
                            }
                            checkableItem = new CheckableItem(deepLink, str, title, subtitle, zF2);
                        } else {
                            checkableItem = null;
                        }
                    }
                    if (checkableItem != null) {
                        arrayList.add(checkableItem);
                    }
                }
                com.avito.conveyor_item.a aVarA = bVar.f242176b.a();
                if (aVarA != null) {
                    arrayList = C42745f0.h0(arrayList, Collections.singletonList(aVarA));
                }
                InterfaceC14567b.C0751b c0751b = new InterfaceC14567b.C0751b(arrayList, selectParameter.getValue() != null);
                this.f242177q = 1;
                if (interfaceC43172j.emit(c0751b, this) == coroutine_suspended) {
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

    @Inject
    public b(@k com.avito.android.details.a aVar, @k d dVar) {
        this.f242175a = aVar;
        this.f242176b = dVar;
    }

    @Override // com.avito.android.publish.screen.step.select.loader.a
    @k
    public final InterfaceC43160i<InterfaceC14567b.C0751b> load() {
        return C43175k.G(new a(null));
    }
}
