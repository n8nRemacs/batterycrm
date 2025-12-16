package com.avito.android.lib.deprecated_design.tab.adapter;

import Y41.l;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.tab.a;
import j.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;

/* compiled from: SimpleTabAdapter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/adapter/c;", "Lcom/avito/android/lib/deprecated_design/tab/a;", "T", "Lcom/avito/android/lib/deprecated_design/tab/adapter/g;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/a;", "b", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c<T extends com.avito.android.lib.deprecated_design.tab.a> extends g<T, com.avito.android.lib.deprecated_design.tab.adapter.a> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final b f178142f = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final l<View, com.avito.android.lib.deprecated_design.tab.adapter.a> f178143e;

    /* compiled from: SimpleTabAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements l<View, e> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f178144b = new a();

        public a() {
            super(1, e.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        @Override // Y41.l
        public final e invoke(View view) {
            return new e(view);
        }
    }

    /* compiled from: SimpleTabAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/adapter/c$b;", "", "<init>", "()V", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ c(j jVar, Context context, int i12, l lVar, int i13, C42822w c42822w) {
        this(jVar, context, (i13 & 4) != 0 ? R.layout.tab_with_counter_redesign : i12, (i13 & 8) != 0 ? a.f178144b : lVar);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    public final void a(i iVar, Object obj) {
        com.avito.android.lib.deprecated_design.tab.a aVar = (com.avito.android.lib.deprecated_design.tab.a) obj;
        ((com.avito.android.lib.deprecated_design.tab.adapter.a) iVar).a(aVar.getF86187d(), aVar.getF316861i());
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    public final i b(View view) {
        return this.f178143e.invoke(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@Y61.k j<T> jVar, @Y61.k Context context, @I int i12, @Y61.k l<? super View, ? extends com.avito.android.lib.deprecated_design.tab.adapter.a> lVar) {
        super(jVar, context, i12);
        this.f178143e = lVar;
    }
}
