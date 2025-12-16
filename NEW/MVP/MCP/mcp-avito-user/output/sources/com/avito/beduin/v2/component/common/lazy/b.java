package com.avito.beduin.v2.component.common.lazy;

import Y61.k;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.beduin.v2.component.common.lazy.d;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import dU0.InterfaceC39628a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: LazyComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/component/common/lazy/b;", "T", "Landroidx/recyclerview/widget/RecyclerView;", "V", "Lcom/avito/beduin/v2/render/android_view/c;", "a", "lazy-container_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class b<T, V extends RecyclerView> extends AbstractC36333c<T, V> {

    /* compiled from: LazyComponent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/beduin/v2/component/common/lazy/b$a;", "", "<init>", "()V", "", "CHILDREN_STATE_KEY", "Ljava/lang/String;", "SCROLL_STATE_KEY", "lazy-container_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void q(View view, Bundle bundle) {
        RecyclerView.m layoutManager;
        RecyclerView recyclerView = (RecyclerView) view;
        Parcelable parcelable = bundle.getParcelable("scroll_state");
        if (parcelable != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.X0(parcelable);
        }
        Bundle bundle2 = bundle.getBundle("children_state");
        if (bundle2 != null) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            d dVar = adapter instanceof d ? (d) adapter : null;
            if (dVar != null) {
                dVar.f335687f.f335689a.putAll(bundle2);
            }
        }
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final Bundle r(View view) {
        Bundle bundle;
        Parcelable parcelableY0;
        RecyclerView recyclerView = (RecyclerView) view;
        Bundle bundle2 = new Bundle();
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && (parcelableY0 = layoutManager.Y0()) != null) {
            bundle2.putParcelable("scroll_state", parcelableY0);
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        d dVar = adapter instanceof d ? (d) adapter : null;
        if (dVar != null) {
            RecyclerView recyclerView2 = dVar.f335688g;
            d.a aVar = dVar.f335687f;
            if (recyclerView2 != null) {
                int childCount = recyclerView2.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    RecyclerView.C cW2 = recyclerView2.W(recyclerView2.getChildAt(i12));
                    e eVar = cW2 instanceof e ? (e) cW2 : null;
                    if (eVar != null) {
                        Bundle bundleE = eVar.f335692c.e();
                        if (bundleE == null) {
                            aVar.getClass();
                        } else {
                            aVar.f335689a.putAll(bundleE);
                        }
                    }
                }
            }
            Bundle bundle3 = aVar.f335689a;
            int size = bundle3.size();
            if (size == 0) {
                bundle = null;
            } else {
                bundle = new Bundle(size);
                bundle.putAll(bundle3);
            }
            if (bundle != null) {
                bundle2.putBundle("children_state", bundle);
            }
        }
        if (bundle2.isEmpty()) {
            return null;
        }
        return bundle2;
    }

    public b(@k PT0.a<V, ? extends InterfaceC39628a>... aVarArr) {
        super((PT0.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }

    public /* synthetic */ b(PT0.a[] aVarArr, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new PT0.a[0] : aVarArr);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void o() {
    }
}
