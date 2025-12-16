package com.avito.android.beduin.common.component.photo_picker;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import j.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinPhotoPickerLayout.kt */
@s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0016J0\u0010\t\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ0\u0010\f\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\f\u0010\nJ0\u0010\r\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\r\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/j;", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/Function1;", "LTV0/a;", "Lkotlin/S;", "name", "item", "Lkotlin/G0;", "listener", "setItemClickListener", "(LY41/l;)V", "Lcom/avito/android/beduin/common/component/photo_picker/items/Photo/a;", "setItemButtonClickListener", "setItemRetryClickListener", "", "columns", "setNumberOfColumns", "(I)V", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel;", "model", "setImages", "(Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel;)V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends RecyclerView {

    /* renamed from: J0, reason: collision with root package name */
    @U
    public static final int f102024J0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f102025F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super TV0.a, G0> f102026G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super com.avito.android.beduin.common.component.photo_picker.items.Photo.a, G0> f102027H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super com.avito.android.beduin.common.component.photo_picker.items.Photo.a, G0> f102028I0;

    /* compiled from: BeduinPhotoPickerLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/j$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f102024J0 = y6.b(12);
    }

    public j(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) throws BlueprintCollisionException {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        k kVar = new k(this);
        com.avito.android.beduin.common.component.photo_picker.items.Photo.b bVar = new com.avito.android.beduin.common.component.photo_picker.items.Photo.b(new com.avito.android.beduin.common.component.photo_picker.items.Photo.f(kVar));
        com.avito.android.beduin.common.component.photo_picker.items.Placeholder.b bVar2 = new com.avito.android.beduin.common.component.photo_picker.items.Placeholder.b(new com.avito.android.beduin.common.component.photo_picker.items.Placeholder.e(kVar));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.d dVar = new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, new i());
        this.f102025F0 = dVar;
        setAdapter(dVar);
        setItemAnimator(null);
        setNestedScrollingEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        int i14 = f102024J0;
        l(new h(i14, i14), -1);
    }

    public final void setImages(@Y61.k BeduinPhotoPickerModel model) {
        BeduinPhotoPickerModel.PhotoPickerConstraints.MaxCountConstraint maxCount;
        ArrayList arrayList = new ArrayList();
        List<BeduinPhotoPickerModel.PhotoPickerImage> listK = model.k();
        int value = 1;
        if (listK != null) {
            List<BeduinPhotoPickerModel.PhotoPickerImage> list = listK;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new com.avito.android.beduin.common.component.photo_picker.items.Photo.a((BeduinPhotoPickerModel.PhotoPickerImage) it.next(), true));
            }
            arrayList.addAll(arrayList2);
        }
        List<BeduinPhotoPickerModel.PhotoPickerImage> listL = model.l();
        if (listL != null) {
            List<BeduinPhotoPickerModel.PhotoPickerImage> list2 = listL;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new com.avito.android.beduin.common.component.photo_picker.items.Photo.a((BeduinPhotoPickerModel.PhotoPickerImage) it2.next(), false));
            }
            arrayList.addAll(arrayList3);
        }
        List<BeduinPhotoPickerModel.PhotoPickerImage> listL2 = model.l();
        if (listL2 == null) {
            listL2 = C42784z0.f406748b;
        }
        int size = listL2.size();
        BeduinPhotoPickerModel.PhotoPickerConstraints constraints = model.getConstraints();
        if (constraints != null && (maxCount = constraints.getMaxCount()) != null) {
            value = maxCount.getValue();
        }
        if (size < value) {
            BeduinPhotoPickerModel.ErrorState errorState = model.f101914d;
            arrayList.add(new com.avito.android.beduin.common.component.photo_picker.items.Placeholder.a(null, errorState != null ? errorState.f101918b : false, errorState != null ? errorState.f101919c : null, 1, null));
        }
        this.f102025F0.l(arrayList, new com.avito.android.app.coldstart.d(this, 7));
    }

    public final void setItemButtonClickListener(@Y61.k Y41.l<? super com.avito.android.beduin.common.component.photo_picker.items.Photo.a, G0> listener) {
        this.f102027H0 = listener;
    }

    public final void setItemClickListener(@Y61.k Y41.l<? super TV0.a, G0> listener) {
        this.f102026G0 = listener;
    }

    public final void setItemRetryClickListener(@Y61.k Y41.l<? super com.avito.android.beduin.common.component.photo_picker.items.Photo.a, G0> listener) {
        this.f102028I0 = listener;
    }

    public final void setNumberOfColumns(int columns) {
        getContext();
        setLayoutManager(new GridLayoutManager(columns));
    }
}
