package com.avito.android.profile.pro.impl.screen.item.avito_finance.item;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import i31.InterfaceC41220a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProAvitoFinanceItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item/k;", "Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item/a;", "Lcom/avito/konveyor/adapter/b;", "a", "b", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.konveyor.adapter.b implements com.avito.android.profile.pro.impl.screen.item.avito_finance.item.a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f223015h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f223016b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f223017c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f223018d;

    /* renamed from: e, reason: collision with root package name */
    public final View f223019e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super com.avito.android.avito_finance_user_profile.view.item.g, G0> f223020f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super com.avito.android.avito_finance_user_profile.view.item.g, G0> f223021g;

    /* compiled from: ProfileProAvitoFinanceItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item/k$a;", "", "<init>", "()V", "", "DEFAULT_WEIGHT", "F", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ProfileProAvitoFinanceItemView.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item/k$b;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @Y61.k
        k a(@Y61.k View view);
    }

    static {
        new a(null);
    }

    @i31.c
    public k(@InterfaceC41220a @Y61.k View view) {
        super(view);
        this.f223016b = this.itemView.getContext();
        View viewFindViewById = view.findViewById(R.id.widget_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f223017c = (LinearLayout) viewFindViewById;
        this.f223018d = (TextView) view.findViewById(R.id.avito_finance_title);
        this.f223019e = view.findViewById(R.id.avito_finance_header_button);
    }
}
