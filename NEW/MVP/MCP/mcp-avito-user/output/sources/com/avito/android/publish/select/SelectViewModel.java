package com.avito.android.publish.select;

import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.blueprints.publish.checkable.CheckableItem;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC33878l;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.SectionTitle;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.architecture_components.D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/select/SelectViewModel;", "Landroidx/lifecycle/M0;", "MainActionState", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SelectViewModel extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f242634E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f242635J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33878l f242636K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f242637L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f242638M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final h f242639N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C0 f242640O;

    /* renamed from: P, reason: collision with root package name */
    public SelectParameter f242641P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final D<a> f242642Q = new D<>();

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f242643R = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0<g> f242644S = new C23038g0<>(new g(C42784z0.f406748b, MainActionState.f242646c));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelectViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/select/SelectViewModel$MainActionState;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MainActionState {

        /* renamed from: b, reason: collision with root package name */
        public static final MainActionState f242645b;

        /* renamed from: c, reason: collision with root package name */
        public static final MainActionState f242646c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ MainActionState[] f242647d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f242648e;

        static {
            MainActionState mainActionState = new MainActionState("VISIBLE", 0);
            f242645b = mainActionState;
            MainActionState mainActionState2 = new MainActionState("HIDDEN", 1);
            f242646c = mainActionState2;
            MainActionState[] mainActionStateArr = {mainActionState, mainActionState2};
            f242647d = mainActionStateArr;
            f242648e = kotlin.enums.c.a(mainActionStateArr);
        }

        public MainActionState() {
            throw null;
        }

        public static MainActionState valueOf(String str) {
            return (MainActionState) Enum.valueOf(MainActionState.class, str);
        }

        public static MainActionState[] values() {
            return (MainActionState[]) f242647d.clone();
        }
    }

    /* compiled from: SelectViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/select/SelectViewModel$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/publish/select/SelectViewModel$a$a;", "Lcom/avito/android/publish/select/SelectViewModel$a$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: SelectViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/select/SelectViewModel$a$a;", "Lcom/avito/android/publish/select/SelectViewModel$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.select.SelectViewModel$a$a, reason: collision with other inner class name */
        public static final /* data */ class C7276a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C7276a f242649a = new C7276a();

            public C7276a() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C7276a);
            }

            public final int hashCode() {
                return -896629352;
            }

            @Y61.k
            public final String toString() {
                return "LeavePublish";
            }
        }

        /* compiled from: SelectViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/select/SelectViewModel$a$b;", "Lcom/avito/android/publish/select/SelectViewModel$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ru.avito.component.toolbar.d f242650a;

            public b(@Y61.k ru.avito.component.toolbar.d dVar) {
                super(null);
                this.f242650a = dVar;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public SelectViewModel(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k InterfaceC33878l interfaceC33878l, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.details.a aVar2, @Y61.k h hVar, @Y61.k C0 c02) {
        this.f242634E = interfaceC35745a5;
        this.f242635J = interfaceC33535v;
        this.f242636K = interfaceC33878l;
        this.f242637L = aVar;
        this.f242638M = aVar2;
        this.f242639N = hVar;
        this.f242640O = c02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ke() {
        com.avito.conveyor_item.a aVar;
        SelectParameter.Value.Widget.Config config;
        SelectParameter.Value.Widget.Config config2;
        SelectParameter selectParameter = this.f242641P;
        if (selectParameter == null) {
            selectParameter = null;
        }
        List<ParcelableEntity<String>> listToShow = selectParameter.getListToShow();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listToShow.iterator();
        while (it.hasNext()) {
            ParcelableEntity parcelableEntity = (ParcelableEntity) it.next();
            if (parcelableEntity instanceof SelectParameter.Value) {
                String str = (String) parcelableEntity.getId();
                SelectParameter.Value value = (SelectParameter.Value) parcelableEntity;
                String title = value.getTitle();
                T id2 = parcelableEntity.getId();
                SelectParameter selectParameter2 = this.f242641P;
                if (selectParameter2 == null) {
                    selectParameter2 = null;
                }
                boolean zF2 = L.f(id2, selectParameter2.getValue());
                SelectParameter.Value.Widget widget = value.getWidget();
                String subtitle = (widget == null || (config2 = widget.getConfig()) == null) ? null : config2.getSubtitle();
                SelectParameter.Value.Widget widget2 = value.getWidget();
                aVar = new CheckableItem((widget2 == null || (config = widget2.getConfig()) == null) ? null : config.getDeepLink(), str, title, subtitle, zF2);
            } else {
                aVar = parcelableEntity instanceof SectionTitle ? new com.avito.android.select.title.a(((SectionTitle) parcelableEntity).getTitle()) : null;
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        com.avito.conveyor_item.a aVarA = this.f242639N.a();
        C23038g0<g> c23038g0 = this.f242644S;
        c23038g0.getValue();
        if (aVarA != null) {
            arrayList = C42745f0.h0(arrayList, Collections.singletonList(aVarA));
        }
        SelectParameter selectParameter3 = this.f242641P;
        c23038g0.setValue(new g(arrayList, (selectParameter3 != null ? selectParameter3 : null).getValue() != null ? MainActionState.f242645b : MainActionState.f242646c));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f242643R.e();
    }
}
