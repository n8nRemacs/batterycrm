package com.avito.android.saved_searches.presentation.items.chips;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchChipsData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/chips/c;", "", "a", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f258458i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f258459a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SelectStrategy f258460b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f258461c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f258462d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f258463e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final g f258464f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f258465g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f258466h;

    /* compiled from: SavedSearchChipsData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/chips/c$a;", "", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l String str, @Y61.k SelectStrategy selectStrategy, @Y61.k ArrayList arrayList, @Y61.k ArrayList arrayList2, @l AttributedText attributedText, @Y61.k g gVar, boolean z12, @l String str2) {
        this.f258459a = str;
        this.f258460b = selectStrategy;
        this.f258461c = arrayList;
        this.f258462d = arrayList2;
        this.f258463e = attributedText;
        this.f258464f = gVar;
        this.f258465g = z12;
        this.f258466h = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f258459a, cVar.f258459a) && this.f258460b == cVar.f258460b && this.f258461c.equals(cVar.f258461c) && this.f258462d.equals(cVar.f258462d) && L.f(this.f258463e, cVar.f258463e) && this.f258464f.equals(cVar.f258464f) && this.f258465g == cVar.f258465g && L.f(this.f258466h, cVar.f258466h);
    }

    public final int hashCode() {
        String str = this.f258459a;
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f258462d, androidx.compose.ui.graphics.colorspace.e.g(this.f258461c, (this.f258460b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31), 31);
        AttributedText attributedText = this.f258463e;
        int i12 = r.i((this.f258464f.hashCode() + ((iG2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31, 31, this.f258465g);
        String str2 = this.f258466h;
        return i12 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SavedSearchChipsData(title=");
        sb2.append(this.f258459a);
        sb2.append(", strategy=");
        sb2.append(this.f258460b);
        sb2.append(", allOptions=");
        sb2.append(this.f258461c);
        sb2.append(", selectedOptions=");
        sb2.append(this.f258462d);
        sb2.append(", motivation=");
        sb2.append(this.f258463e);
        sb2.append(", chipsSelectedListener=");
        sb2.append(this.f258464f);
        sb2.append(", keepSelected=");
        sb2.append(this.f258465g);
        sb2.append(", errorMessage=");
        return C22026a.c(sb2, this.f258466h, ')');
    }
}
