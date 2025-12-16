package com.avito.android.bxcontent.beduin_v2.wrapper.cell;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BxComponentContainerHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/cell/m;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f109588a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f109589b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f109590c;

    /* compiled from: BxComponentContainerHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/cell/m$a;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final l1 f109591a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.konveyor.adapter.b f109592b;

        public a(@Y61.k l1 l1Var, @Y61.k com.avito.konveyor.adapter.b bVar) {
            this.f109591a = l1Var;
            this.f109592b = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f109591a, aVar.f109591a) && L.f(this.f109592b, aVar.f109592b);
        }

        public final int hashCode() {
            return this.f109592b.hashCode() + (this.f109591a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "NativeItem(item=" + this.f109591a + ", viewHolder=" + this.f109592b + ')';
        }
    }

    public m(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.konveyor.a aVar) {
        this.f109588a = viewGroup;
        this.f109589b = aVar;
        this.f109590c = LayoutInflater.from(viewGroup.getContext());
    }
}
