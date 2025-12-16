package com.avito.android.suggest_locations.adapter;

import Y61.k;
import Y61.l;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.remote.model.CaseText;
import com.avito.android.suggest_locations.adapter.SuggestLocationItem;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l41.o;
import l41.r;

/* compiled from: SuggestLocationsAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_locations/adapter/e;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$C;", "a", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends RecyclerView.Adapter<RecyclerView.C> {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f292236c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f292237d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public List<SuggestLocationItem> f292238e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public List<AddressSuggestion> f292239f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public LayoutInflater f292240g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<SuggestLocationItem> f292241h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<AddressSuggestion> f292242i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e f292243j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e f292244k;

    /* compiled from: SuggestLocationsAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/suggest_locations/adapter/e$a;", "", "<init>", "()V", "", "TYPE_ADDRESS", "I", "TYPE_LOCATION", "TYPE_ONLY_REAL_LOCATION", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SuggestLocationsAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> implements r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            int iIntValue = ((Number) obj).intValue();
            return iIntValue >= 0 && iIntValue < e.this.f292239f.size();
        }
    }

    /* compiled from: SuggestLocationsAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c<T, R> implements o {
        public c() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return e.this.f292239f.get(((Number) obj).intValue());
        }
    }

    /* compiled from: SuggestLocationsAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d<T> implements r {
        public d() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            int iIntValue = ((Number) obj).intValue();
            return iIntValue >= 0 && iIntValue < e.this.f292238e.size();
        }
    }

    /* compiled from: SuggestLocationsAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/suggest_locations/adapter/SuggestLocationItem;", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.suggest_locations.adapter.e$e, reason: collision with other inner class name */
    public static final class C8860e<T, R> implements o {
        public C8860e() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return e.this.f292238e.get(((Number) obj).intValue());
        }
    }

    /* compiled from: SuggestLocationsAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f<T> implements r {
        public f() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            int iIntValue = ((Number) obj).intValue();
            return iIntValue >= 0 && iIntValue < e.this.f292238e.size();
        }
    }

    /* compiled from: SuggestLocationsAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/suggest_locations/adapter/SuggestLocationItem;", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g<T, R> implements o {
        public g() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return e.this.f292238e.get(((Number) obj).intValue());
        }
    }

    static {
        new a(null);
    }

    public e(boolean z12, boolean z13) {
        this.f292236c = z12;
        this.f292237d = z13;
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f292238e = c42784z0;
        this.f292239f = c42784z0;
        io.reactivex.rxjava3.subjects.e<SuggestLocationItem> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f292241h = eVar;
        io.reactivex.rxjava3.subjects.e<AddressSuggestion> eVar2 = new io.reactivex.rxjava3.subjects.e<>();
        this.f292242i = eVar2;
        this.f292243j = eVar;
        this.f292244k = eVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return (this.f292236c ? this.f292239f : this.f292238e).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        if (this.f292236c) {
            return 1;
        }
        return (!this.f292237d || this.f292238e.get(i12).f292216d == null) ? 2 : 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@k RecyclerView.C c12, int i12) {
        com.avito.android.suggest_locations.adapter.c cVar;
        String name;
        String name2;
        if (this.f292236c) {
            cVar = c12 instanceof com.avito.android.suggest_locations.adapter.b ? (com.avito.android.suggest_locations.adapter.b) c12 : null;
            if (cVar != null) {
                AddressSuggestion addressSuggestion = this.f292239f.get(i12);
                I5.a(cVar.f292232c, addressSuggestion.getTitle(), false);
                I5.a(cVar.f292233d, addressSuggestion.getSubtitle(), false);
                AddressSuggestion.SuggestType suggestType = addressSuggestion.getSuggestType();
                AddressSuggestion.SuggestType suggestType2 = AddressSuggestion.SuggestType.HISTORICAL;
                ImageView imageView = cVar.f292234e;
                if (suggestType == suggestType2) {
                    D6.H(imageView);
                    return;
                } else {
                    D6.w(imageView);
                    return;
                }
            }
            return;
        }
        if (this.f292237d && this.f292238e.get(i12).f292216d != null) {
            cVar = c12 instanceof i ? (i) c12 : null;
            if (cVar != null) {
                SuggestLocationItem suggestLocationItem = this.f292238e.get(i12);
                CaseText caseText = suggestLocationItem.f292215c;
                SuggestLocationItem.From from = suggestLocationItem.f292216d;
                if (from == null || (name = from.f292220c) == null) {
                    name = caseText.getName();
                }
                I5.a(cVar.f292232c, name, false);
                if (from == null || (name2 = from.f292221d) == null) {
                    name2 = caseText.getName();
                }
                I5.a(cVar.f292233d, name2, false);
                SuggestLocationItem.SuggestType suggestType3 = SuggestLocationItem.SuggestType.f292224c;
                SuggestLocationItem.SuggestType suggestType4 = suggestLocationItem.f292218f;
                ImageView imageView2 = cVar.f292234e;
                if (suggestType4 == suggestType3) {
                    D6.H(imageView2);
                    return;
                } else {
                    D6.w(imageView2);
                    return;
                }
            }
            return;
        }
        cVar = c12 instanceof com.avito.android.suggest_locations.adapter.g ? (com.avito.android.suggest_locations.adapter.g) c12 : null;
        if (cVar != null) {
            SuggestLocationItem suggestLocationItem2 = this.f292238e.get(i12);
            D6.G(cVar.f292234e, suggestLocationItem2.f292218f == SuggestLocationItem.SuggestType.f292224c);
            TextView textView = cVar.f292232c;
            TextView textView2 = cVar.f292233d;
            CaseText caseText2 = suggestLocationItem2.f292215c;
            SuggestLocationItem.From from2 = suggestLocationItem2.f292216d;
            if (from2 != null) {
                D6.w(textView2);
                String str = from2.f292220c;
                if (str == null) {
                    str = "";
                }
                String str2 = String.format("%s → %s", Arrays.copyOf(new Object[]{str, caseText2.getName()}, 2));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                spannableStringBuilder.setSpan(new StyleSpan(1), str.length() + 3, str2.length(), 17);
                I5.a(textView, spannableStringBuilder, false);
                return;
            }
            SuggestLocationItem.Parent parent = suggestLocationItem2.f292217e;
            if (parent == null) {
                textView.setText(caseText2.getName());
                D6.w(textView2);
            } else {
                D6.G(textView2, true);
                textView2.setText(parent.f292223c.getName());
                textView.setText(caseText2.getName());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @k
    public final RecyclerView.C onCreateViewHolder(@k ViewGroup viewGroup, int i12) {
        LayoutInflater layoutInflaterFrom = this.f292240g;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            this.f292240g = layoutInflaterFrom;
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.suggest_locations_item, viewGroup, false);
        if (i12 == 1) {
            com.avito.android.suggest_locations.adapter.b bVar = new com.avito.android.suggest_locations.adapter.b(viewInflate);
            bVar.f292231b.N(new b()).d0(new c()).c(this.f292242i);
            return bVar;
        }
        io.reactivex.rxjava3.subjects.e<SuggestLocationItem> eVar = this.f292241h;
        if (i12 != 3) {
            com.avito.android.suggest_locations.adapter.g gVar = new com.avito.android.suggest_locations.adapter.g(viewInflate);
            gVar.f292231b.N(new f()).d0(new g()).c(eVar);
            return gVar;
        }
        i iVar = new i(viewInflate);
        iVar.f292231b.N(new d()).d0(new C8860e()).c(eVar);
        return iVar;
    }
}
