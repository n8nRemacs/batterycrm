package com.avito.android.suggest_locations.adapter;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: SuggestHolder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/suggest_locations/adapter/c;", "T", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class c<T> extends RecyclerView.C {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final B0 f292231b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f292232c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f292233d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f292234e;

    /* compiled from: SuggestHolder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c<T> f292235b;

        public a(c<T> cVar) {
            this.f292235b = cVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return Integer.valueOf(this.f292235b.getAdapterPosition());
        }
    }

    public c(@k View view) {
        super(view);
        this.f292231b = C37722i.a(view).d0(new a(this));
        View viewFindViewById = view.findViewById(R.id.text_location);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f292232c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.text_parent);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f292233d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image_historical);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f292234e = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.item_text_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        View viewFindViewById5 = view.findViewById(R.id.location_suggests_item);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
    }
}
