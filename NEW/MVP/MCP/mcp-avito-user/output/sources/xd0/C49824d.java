package xD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import kotlin.Metadata;
import wD0.C49487a;

/* compiled from: PackagesCountPrice.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LxD0/d;", "", "LwD0/a;", "price", "discount", "Lcom/avito/android/remote/model/ButtonAction;", "button", "LxD0/e;", "pubPrice", "<init>", "(LwD0/a;LwD0/a;Lcom/avito/android/remote/model/ButtonAction;LxD0/e;)V", "LwD0/a;", "c", "()LwD0/a;", "b", "Lcom/avito/android/remote/model/ButtonAction;", "a", "()Lcom/avito/android/remote/model/ButtonAction;", "LxD0/e;", "d", "()LxD0/e;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xD0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49824d {

    @com.google.gson.annotations.c("button")
    @k
    private final ButtonAction button;

    @com.google.gson.annotations.c("discount")
    @l
    private final C49487a discount;

    @com.google.gson.annotations.c("price")
    @k
    private final C49487a price;

    @com.google.gson.annotations.c("pubPrice")
    @l
    private final e pubPrice;

    public C49824d(@k C49487a c49487a, @l C49487a c49487a2, @k ButtonAction buttonAction, @l e eVar) {
        this.price = c49487a;
        this.discount = c49487a2;
        this.button = buttonAction;
        this.pubPrice = eVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C49487a getDiscount() {
        return this.discount;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final C49487a getPrice() {
        return this.price;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final e getPubPrice() {
        return this.pubPrice;
    }
}
