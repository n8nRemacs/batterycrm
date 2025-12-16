package com.avito.android.beduin.common.displaying;

import K51.d;
import Y61.k;
import Y61.l;
import ai.InterfaceC19892b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AndDisplayingPredicate.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 ¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/common/displaying/AndDisplayingPredicate;", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "", "predicates", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "", "", "", "store", "", "getVisibility", "(Ljava/util/Map;)Z", "copy", "(Ljava/util/List;)Lcom/avito/android/beduin/common/displaying/AndDisplayingPredicate;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes11.dex */
public final /* data */ class AndDisplayingPredicate implements DisplayingPredicate {

    @k
    public static final Parcelable.Creator<AndDisplayingPredicate> CREATOR = new b();

    @k
    private final List<DisplayingPredicate> predicates;

    /* compiled from: AndDisplayingPredicate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/displaying/AndDisplayingPredicate$a;", "Lai/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC19892b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Class<? extends DisplayingPredicate> f103291a = AndDisplayingPredicate.class;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f103292b = "and";

        @Override // ai.InterfaceC19892b
        @k
        public final Class<? extends DisplayingPredicate> a() {
            return this.f103291a;
        }

        @Override // ai.InterfaceC19892b
        @k
        /* renamed from: getType, reason: from getter */
        public final String getF103292b() {
            return this.f103292b;
        }
    }

    /* compiled from: AndDisplayingPredicate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AndDisplayingPredicate> {
        @Override // android.os.Parcelable.Creator
        public final AndDisplayingPredicate createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AndDisplayingPredicate.class, parcel, arrayList, iL2, 1);
            }
            return new AndDisplayingPredicate(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AndDisplayingPredicate[] newArray(int i12) {
            return new AndDisplayingPredicate[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndDisplayingPredicate(@k List<? extends DisplayingPredicate> list) {
        this.predicates = list;
    }

    private final List<DisplayingPredicate> component1() {
        return this.predicates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndDisplayingPredicate copy$default(AndDisplayingPredicate andDisplayingPredicate, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = andDisplayingPredicate.predicates;
        }
        return andDisplayingPredicate.copy(list);
    }

    @k
    public final AndDisplayingPredicate copy(@k List<? extends DisplayingPredicate> predicates) {
        return new AndDisplayingPredicate(predicates);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AndDisplayingPredicate) && L.f(this.predicates, ((AndDisplayingPredicate) other).predicates);
    }

    @Override // com.avito.android.beduin_models.DisplayingPredicate
    public boolean getVisibility(@k Map<String, ? extends Object> store) {
        List<DisplayingPredicate> list = this.predicates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((DisplayingPredicate) it.next()).getVisibility(store)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.predicates.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("AndDisplayingPredicate(predicates="), this.predicates, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.predicates, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
    }
}
