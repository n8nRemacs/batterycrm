package com.avito.android.sx_address.new_address.view;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TitleItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/z;", "Lcom/avito/android/sx_address/new_address/view/v;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class z implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f294009a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f294010b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public N f294011c;

    /* compiled from: TitleItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f294012l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public z(@Y61.k View view) {
        this.f294009a = view;
        View viewFindViewById = view.findViewById(R.id.title_input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f294010b = (Input) viewFindViewById;
        this.f294011c = a.f294012l;
    }
}
