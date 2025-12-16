package com.avito.android.location_picker.view;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.Metadata;

/* compiled from: SuggestionsAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/view/V;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class V extends RecyclerView.C {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f182545b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f182546c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final B0 f182547d;

    /* compiled from: SuggestionsAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return Integer.valueOf(V.this.getBindingAdapterPosition());
        }
    }

    public V(@Y61.k View view) {
        super(view);
        this.f182545b = (TextView) view.findViewById(R.id.text_view);
        this.f182546c = (TextView) view.findViewById(R.id.subtext_view);
        this.f182547d = C37722i.a(view).d0(new a());
    }
}
