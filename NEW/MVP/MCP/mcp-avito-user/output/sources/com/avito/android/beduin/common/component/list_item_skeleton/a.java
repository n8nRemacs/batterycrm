package com.avito.android.beduin.common.component.list_item_skeleton;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.l;
import com.avito.android.beduin_models.BeduinModel;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinListItemSkeletonComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/list_item_skeleton/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/list_item_skeleton/BeduinListItemSkeletonModel;", "Lcom/avito/android/beduin/common/component/list_item_skeleton/e;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinListItemSkeletonModel, e> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C3048a f101707f = new C3048a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final Class<? extends BeduinModel> f101708g = BeduinListItemSkeletonModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinListItemSkeletonModel f101709e;

    /* compiled from: BeduinListItemSkeletonComponent.kt */
    @l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/list_item_skeleton/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.list_item_skeleton.a$a, reason: collision with other inner class name */
    public static final class C3048a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3048a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return a.f101708g;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return Collections.singletonList("listItemSkeleton");
        }

        public C3048a() {
        }
    }

    public a(@k BeduinListItemSkeletonModel beduinListItemSkeletonModel) {
        this.f101709e = beduinListItemSkeletonModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101709e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        e eVar = new e(viewGroup.getContext(), null, 0, 6, null);
        eVar.setId(View.generateViewId());
        eVar.setLayoutParams(layoutParams);
        return eVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final /* bridge */ /* synthetic */ void q(View view) {
    }
}
