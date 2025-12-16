package com.avito.android.select.bottom_sheet.blueprints.icon_button_right;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ItemWithIconButtonRightView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/icon_button_right/b;", "Lcom/avito/konveyor/adapter/b;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends com.avito.konveyor.adapter.b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f265138e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f265139b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f265140c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f265141d;

    public b(@k View view) {
        super(view);
        this.f265139b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f265140c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.right_text_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f265141d = (TextView) viewFindViewById2;
    }
}
