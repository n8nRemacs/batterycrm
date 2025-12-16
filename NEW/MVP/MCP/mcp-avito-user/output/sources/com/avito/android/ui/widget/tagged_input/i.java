package com.avito.android.ui.widget.tagged_input;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.item_map.view.C31075l;
import com.avito.android.ui.widget.tagged_input.m;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import j.I;
import j.InterfaceC42161q;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TagsListView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ui/widget/tagged_input/i;", "Lcom/avito/android/ui/widget/tagged_input/g;", "a", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f304713b;

    /* renamed from: c, reason: collision with root package name */
    public final int f304714c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f304715d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public m f304716e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f304717f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Boolean> f304718g;

    /* compiled from: TagsListView.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ui/widget/tagged_input/i$a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/ui/widget/tagged_input/c;", "a", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.Adapter<com.avito.android.ui.widget.tagged_input.c> {

        /* renamed from: c, reason: collision with root package name */
        public final int f304719c;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public LayoutInflater f304721e;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public Object f304720d = C42784z0.f406748b;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final com.jakewharton.rxrelay3.c f304722f = new com.jakewharton.rxrelay3.c();

        /* compiled from: TagsListView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/widget/tagged_input/i$a$a;", "Landroidx/recyclerview/widget/o$b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.ui.widget.tagged_input.i$a$a, reason: collision with other inner class name */
        public static final class C9359a extends C23424o.b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Object f304723a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final List<TagItem> f304724b;

            public C9359a(@Y61.k List<TagItem> list, @Y61.k List<TagItem> list2) {
                this.f304723a = list;
                this.f304724b = list2;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
            @Override // androidx.recyclerview.widget.C23424o.b
            public final boolean areContentsTheSame(int i12, int i13) {
                return L.f(this.f304723a.get(i12), this.f304724b.get(i13));
            }

            @Override // androidx.recyclerview.widget.C23424o.b
            public final boolean areItemsTheSame(int i12, int i13) {
                return areContentsTheSame(i12, i13);
            }

            @Override // androidx.recyclerview.widget.C23424o.b
            public final int getNewListSize() {
                return this.f304724b.size();
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
            @Override // androidx.recyclerview.widget.C23424o.b
            public final int getOldListSize() {
                return this.f304723a.size();
            }
        }

        public a(@I int i12) {
            this.f304719c = i12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f304720d.size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.C c12, int i12) {
            com.avito.android.ui.widget.tagged_input.c cVar = (com.avito.android.ui.widget.tagged_input.c) c12;
            TagItem tagItem = (TagItem) this.f304720d.get(i12);
            cVar.setText(tagItem.f304693b);
            cVar.c(new j(this, tagItem));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
            LayoutInflater layoutInflaterFrom = this.f304721e;
            if (layoutInflaterFrom == null) {
                layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                this.f304721e = layoutInflaterFrom;
            }
            return new d(layoutInflaterFrom.inflate(this.f304719c, viewGroup, false));
        }
    }

    /* compiled from: TagsListView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/ui/widget/tagged_input/TagItem;", "kotlin.jvm.PlatformType", "tagItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/ui/widget/tagged_input/TagItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<TagItem, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ m f304725l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f304726m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f304727n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m mVar, String str, boolean z12) {
            super(1);
            this.f304725l = mVar;
            this.f304726m = str;
            this.f304727n = z12;
        }

        @Override // Y41.l
        public final G0 invoke(TagItem tagItem) {
            List<TagItem> value;
            TagItem tagItem2 = tagItem;
            m.a aVar = this.f304725l.f304731E;
            String str = this.f304726m;
            aVar.b(str).setValue(tagItem2);
            if (!this.f304727n && (value = aVar.a(str).getValue()) != null) {
                ArrayList arrayList = new ArrayList(value);
                if (arrayList.remove(tagItem2)) {
                    if (arrayList.isEmpty()) {
                        aVar.c(str).setValue(Boolean.FALSE);
                    }
                    aVar.a(str).setValue(arrayList);
                } else {
                    V2.f318762a.e("Failed to remove tag " + tagItem2, null);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TagsListView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f304728l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            com.avito.android.bxcontent.mvi.entity.f.t("Failed to process tag click ", th2, V2.f318762a, null);
            return G0.f406611a;
        }
    }

    public i(@Y61.k RecyclerView recyclerView, @InterfaceC42161q int i12, @I int i13) {
        this.f304713b = recyclerView;
        this.f304714c = i12;
        a aVar = new a(i13);
        this.f304715d = aVar;
        this.f304717f = new io.reactivex.rxjava3.disposables.c();
        com.jakewharton.rxrelay3.c<Boolean> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f304718g = cVar;
        new C41981q0(cVar);
        recyclerView.setAdapter(aVar);
    }

    @Override // com.avito.android.ui.widget.tagged_input.g
    public final void FC(@Y61.k String str, @Y61.k InterfaceC22983P interfaceC22983P) {
        this.f304717f.e();
        D6.G(this.f304713b, false);
        this.f304718g.accept(Boolean.FALSE);
        m mVar = this.f304716e;
        if (mVar == null) {
            return;
        }
        m.a aVar = mVar.f304731E;
        aVar.c(str).removeObservers(interfaceC22983P);
        aVar.a(str).removeObservers(interfaceC22983P);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @Override // com.avito.android.ui.widget.tagged_input.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Mi(boolean r11) throws android.content.res.Resources.NotFoundException {
        /*
            r10 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r10.f304713b
            android.content.res.Resources r1 = r0.getResources()
            int r2 = r10.f304714c
            int r5 = r1.getDimensionPixelSize(r2)
            android.content.Context r1 = r0.getContext()
            android.graphics.Point r2 = com.avito.android.util.C35835l0.g(r1)
            int r2 = r2.y
            android.graphics.Point r1 = com.avito.android.util.C35835l0.g(r1)
            int r1 = r1.x
            r3 = 1
            if (r2 <= r1) goto L3c
            float r4 = (float) r2
            float r1 = (float) r1
            float r4 = r4 / r1
            r1 = 1072735191(0x3ff0a3d7, float:1.88)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L2f
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r2 <= r1) goto L2f
            r1 = 3
            goto L3d
        L2f:
            r1 = 1070805811(0x3fd33333, float:1.65)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L3c
            r1 = 1920(0x780, float:2.69E-42)
            if (r2 <= r1) goto L3c
            r1 = 2
            goto L3d
        L3c:
            r1 = r3
        L3d:
            if (r11 != 0) goto L52
            if (r1 != r3) goto L42
            goto L52
        L42:
            com.avito.android.lib.design.chips.MultilineLayoutManager r11 = new com.avito.android.lib.design.chips.MultilineLayoutManager
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r9 = 0
            r7 = 0
            r8 = 8
            r3 = r11
            r4 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L64
        L52:
            com.avito.android.ui.widget.tagged_input.a r11 = new com.avito.android.ui.widget.tagged_input.a
            r11.<init>(r5)
            r1 = -1
            r0.l(r11, r1)
            androidx.recyclerview.widget.LinearLayoutManager r11 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.getContext()
            r1 = 0
            r11.<init>(r1, r1)
        L64:
            r0.setLayoutManager(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ui.widget.tagged_input.i.Mi(boolean):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final void a(List<TagItem> list) {
        a aVar = this.f304715d;
        C23424o.e eVarA = C23424o.a(new a.C9359a(aVar.f304720d, list), true);
        aVar.f304720d = new ArrayList(list);
        eVarA.b(aVar);
        RecyclerView recyclerView = this.f304713b;
        recyclerView.postDelayed(new com.avito.android.publish.screen.objects.view.actions.h(recyclerView, 26), 300L);
    }

    @Override // com.avito.android.ui.widget.tagged_input.g
    public final void uR(@Y61.k String str, @Y61.k m mVar, @Y61.k InterfaceC22983P interfaceC22983P, boolean z12) {
        this.f304716e = mVar;
        com.jakewharton.rxrelay3.c cVar = this.f304715d.f304722f;
        cVar.getClass();
        this.f304717f.b(cVar.D(io.reactivex.rxjava3.internal.functions.a.f401991a).v0(new C31075l(19, new b(mVar, str, z12)), new C31075l(20, c.f304728l), io.reactivex.rxjava3.internal.functions.a.f401993c));
        m mVar2 = this.f304716e;
        if (mVar2 == null) {
            return;
        }
        m.a aVar = mVar2.f304731E;
        Boolean value = aVar.c(str).getValue();
        if (value != null) {
            D6.G(this.f304713b, value.booleanValue());
            this.f304718g.accept(value);
        }
        final int i12 = 0;
        aVar.c(str).observe(interfaceC22983P, new InterfaceC23040h0(this) { // from class: com.avito.android.ui.widget.tagged_input.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f304712c;

            {
                this.f304712c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                switch (i12) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
                        i iVar = this.f304712c;
                        D6.G(iVar.f304713b, zBooleanValue);
                        iVar.f304718g.accept(Boolean.valueOf(zBooleanValue));
                        break;
                    default:
                        List<TagItem> list = (List) obj;
                        if (list == null) {
                            list = C42784z0.f406748b;
                        }
                        this.f304712c.a(list);
                        break;
                }
            }
        });
        List<TagItem> value2 = aVar.a(str).getValue();
        if (value2 != null) {
            a(value2);
        }
        final int i13 = 1;
        aVar.a(str).observe(interfaceC22983P, new InterfaceC23040h0(this) { // from class: com.avito.android.ui.widget.tagged_input.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f304712c;

            {
                this.f304712c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                switch (i13) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
                        i iVar = this.f304712c;
                        D6.G(iVar.f304713b, zBooleanValue);
                        iVar.f304718g.accept(Boolean.valueOf(zBooleanValue));
                        break;
                    default:
                        List<TagItem> list = (List) obj;
                        if (list == null) {
                            list = C42784z0.f406748b;
                        }
                        this.f304712c.a(list);
                        break;
                }
            }
        });
    }

    public /* synthetic */ i(RecyclerView recyclerView, int i12, int i13, int i14, C42822w c42822w) {
        this(recyclerView, i12, (i14 & 4) != 0 ? R.layout.tag_button : i13);
    }
}
