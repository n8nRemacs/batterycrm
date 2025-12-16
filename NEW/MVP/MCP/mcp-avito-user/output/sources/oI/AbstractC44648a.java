package oI;

import X41.i;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.avito.android.historical_suggests.model.AddressType;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BaseHistoricalSuggestsView.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000b\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fR8\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\t\u0010\bRI\u0010\u001a\u001a)\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u000b\u0010\b¨\u0006\u001b"}, d2 = {"LoI/a;", "Landroid/widget/FrameLayout;", "Lkotlin/Function2;", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;", "Lcom/avito/android/historical_suggests/model/AddressType;", "Lkotlin/G0;", "listener", "setSelectListenerFunction", "(LY41/p;)V", "setSelectListener", "setDataLoadedListenerFunction", "setDataLoadedListener", "", "isVisible", "setContentVisibility", "(Z)V", "b", "LY41/p;", "getSelectListener", "()LY41/p;", "selectListener", "Lkotlin/S;", "name", "firstItem", "c", "getDataLoadedListener", "dataLoadedListener", "_avito_historical-suggests_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oI.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC44648a extends FrameLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public p<? super AddressParameter.Value, ? super AddressType, G0> selectListener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public p<? super AddressParameter.Value, ? super AddressType, G0> dataLoadedListener;

    public AbstractC44648a(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }

    public abstract void a(@k AddressParameter.Value value);

    @l
    public final p<AddressParameter.Value, AddressType, G0> getDataLoadedListener() {
        return this.dataLoadedListener;
    }

    @l
    public final p<AddressParameter.Value, AddressType, G0> getSelectListener() {
        return this.selectListener;
    }

    public abstract void setContentVisibility(boolean isVisible);

    public final void setDataLoadedListener(@l p<? super AddressParameter.Value, ? super AddressType, G0> pVar) {
        this.dataLoadedListener = pVar;
    }

    @i
    public final void setDataLoadedListenerFunction(@l p<? super AddressParameter.Value, ? super AddressType, G0> listener) {
        this.dataLoadedListener = listener;
    }

    public final void setSelectListener(@l p<? super AddressParameter.Value, ? super AddressType, G0> pVar) {
        this.selectListener = pVar;
    }

    @i
    public final void setSelectListenerFunction(@l p<? super AddressParameter.Value, ? super AddressType, G0> listener) {
        this.selectListener = listener;
    }
}
