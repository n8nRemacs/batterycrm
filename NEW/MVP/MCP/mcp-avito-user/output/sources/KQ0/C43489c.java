package kq0;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.tab.adapter.h;
import com.avito.android.lib.deprecated_design.tab.adapter.i;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContainerTabView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkq0/c;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/i;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/h;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kq0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43489c implements i, h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f413242a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f413243b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f413244c;

    /* renamed from: d, reason: collision with root package name */
    public final int f413245d;

    /* renamed from: e, reason: collision with root package name */
    public final int f413246e;

    /* renamed from: f, reason: collision with root package name */
    public final int f413247f;

    public C43489c(@k View view) {
        this.f413242a = view;
        View viewFindViewById = view.findViewById(R.id.tab_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f413243b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tab_counter);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        this.f413244c = textView;
        this.f413245d = C35835l0.d(R.attr.black, view.getContext());
        int iD2 = C35835l0.d(R.attr.gray48, view.getContext());
        this.f413246e = iD2;
        this.f413247f = R.id.tab_title;
        textView.setTextColor(iD2);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    public final void b(int i12, int i13, boolean z12) {
        this.f413243b.setTextColor(z12 ? this.f413245d : this.f413246e);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.h
    @k
    public final Integer c() {
        return Integer.valueOf(this.f413247f);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    @k
    /* renamed from: getView, reason: from getter */
    public final View getF635a() {
        return this.f413242a;
    }
}
