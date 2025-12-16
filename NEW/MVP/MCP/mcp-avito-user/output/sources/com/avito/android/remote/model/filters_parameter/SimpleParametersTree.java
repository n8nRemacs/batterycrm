package com.avito.android.remote.model.filters_parameter;

import K51.d;
import Y41.q;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.CategoryAndTypeParameter;
import com.avito.android.remote.model.category_parameters.CheckinCheckoutParameter;
import com.avito.android.remote.model.category_parameters.DateTimeIntervalParameter;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.GroupMarkerParameter;
import com.avito.android.remote.model.category_parameters.GroupParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.base.TextParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.filters_parameter.ParametersTree;
import com.avito.android.remote.model.filters_parameter.slot.Slot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ParametersTree.kt */
@d
@s0
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001MB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0082\b¢\u0006\u0004\b\t\u0010\nJ(\u0010\f\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0013\u0010\u0017J!\u0010\u0019\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJB\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u00072'\u0010\u001d\u001a#\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001b¢\u0006\u0002\b\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010%\u001a\u00020$*\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010'J\u0017\u0010(\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b(\u0010'J%\u0010,\u001a\u00020$2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*\u0018\u00010)H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0012H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020$H\u0016¢\u0006\u0004\b1\u00102J)\u00106\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u00103*\u00020\u00032\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0016¢\u0006\u0004\b6\u00107J-\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u00103*\u00020\u00032\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0012H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0012H\u0016¢\u0006\u0004\b>\u0010=J\u001a\u0010A\u001a\u00020$2\b\u0010@\u001a\u0004\u0018\u00010?H\u0096\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0007H\u0016¢\u0006\u0004\bC\u0010DJ \u0010H\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\bH\u0010IR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010JR\u0014\u0010L\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010=¨\u0006N"}, d2 = {"Lcom/avito/android/remote/model/filters_parameter/SimpleParametersTree;", "Lcom/avito/android/remote/model/filters_parameter/ParametersTree;", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Ljava/util/List;)V", "", "id", "sameId", "(Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "holder", "holderId", "(Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;)Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "", "Lkotlin/G0;", "appendParameters", "(Ljava/util/List;Ljava/util/List;)V", "", "countParameters", "(Ljava/util/List;)I", "Lcom/avito/android/remote/model/category_parameters/SelectParameter;", "select", "(Lcom/avito/android/remote/model/category_parameters/SelectParameter;)I", "Lcom/avito/android/remote/model/filters_parameter/SimpleParametersTree$ParameterHolder;", "traverseDown", "(Ljava/util/List;Lcom/avito/android/remote/model/filters_parameter/SimpleParametersTree$ParameterHolder;)V", "Lkotlin/Function3;", "Lkotlin/w;", "comparator", "findParameter", "(Ljava/lang/String;LY41/q;)Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "parameter", "offer", "(Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;Lcom/avito/android/remote/model/filters_parameter/SimpleParametersTree$ParameterHolder;)V", "Lcom/avito/android/remote/model/category_parameters/GroupParameter;", "", "isClearance", "(Lcom/avito/android/remote/model/category_parameters/GroupParameter;)Z", "(Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "findParameterHolder", "", "Lcom/avito/android/remote/model/PretendErrorValue;", "pretendResult", "applyPretendResult", "(Ljava/util/Map;)Z", "position", "getItem", "(I)Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "isEmpty", "()Z", "T", "Ljava/lang/Class;", "type", "getFirstParameterOfType", "(Ljava/lang/Class;)Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "findParametersOfType", "(Ljava/lang/Class;)Ljava/util/List;", "getParametersExceptOwnedBySlots", "()Ljava/util/List;", "describeContents", "()I", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getCount", "count", "ParameterHolder", "_avito-discouraged_avito-api_filters"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SimpleParametersTree implements ParametersTree {

    @k
    public static final Parcelable.Creator<SimpleParametersTree> CREATOR = new Creator();

    @k
    private final List<ParameterSlot> parameters;

    /* compiled from: ParametersTree.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SimpleParametersTree> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SimpleParametersTree createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(SimpleParametersTree.class, parcel, arrayList, iL2, 1);
            }
            return new SimpleParametersTree(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SimpleParametersTree[] newArray(int i12) {
            return new SimpleParametersTree[i12];
        }
    }

    /* compiled from: ParametersTree.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/filters_parameter/SimpleParametersTree$ParameterHolder;", "", "counter", "", "(I)V", "parameter", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "getParameter", "()Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "setParameter", "(Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;)V", "consumePosition", "inTargetPosition", "", "isValueFound", "tryConsume", "_avito-discouraged_avito-api_filters"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ParameterHolder {
        private int counter;

        @l
        private ParameterSlot parameter;

        public ParameterHolder(int i12) {
            this.counter = i12;
        }

        private final boolean inTargetPosition() {
            return this.counter == 0;
        }

        public final int consumePosition() {
            int i12 = this.counter;
            this.counter = i12 - 1;
            return i12;
        }

        @l
        public final ParameterSlot getParameter() {
            return this.parameter;
        }

        public final boolean isValueFound() {
            return this.parameter != null;
        }

        public final void setParameter(@l ParameterSlot parameterSlot) {
            this.parameter = parameterSlot;
        }

        public final boolean tryConsume(@k ParameterSlot parameter) {
            if (!inTargetPosition()) {
                return false;
            }
            this.parameter = parameter;
            this.counter = -1;
            return true;
        }
    }

    /* compiled from: ParametersTree.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "checkId", "", "<anonymous parameter 1>", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.model.filters_parameter.SimpleParametersTree$findParameter$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements q<ParameterSlot, String, ParameterSlot, ParameterSlot> {
        public AnonymousClass1() {
            super(3);
        }

        @Override // Y41.q
        @l
        public final ParameterSlot invoke(@l ParameterSlot parameterSlot, @k String str, @k ParameterSlot parameterSlot2) {
            if (L.f(parameterSlot != null ? parameterSlot.getId() : null, str)) {
                return parameterSlot;
            }
            return null;
        }
    }

    /* compiled from: ParametersTree.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "checkId", "", "holder", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.model.filters_parameter.SimpleParametersTree$findParameterHolder$1, reason: invalid class name and case insensitive filesystem */
    public static final class C343311 extends N implements q<ParameterSlot, String, ParameterSlot, ParameterSlot> {
        public C343311() {
            super(3);
        }

        @Override // Y41.q
        @l
        public final ParameterSlot invoke(@l ParameterSlot parameterSlot, @k String str, @k ParameterSlot parameterSlot2) {
            if (L.f(parameterSlot != null ? parameterSlot.getId() : null, str)) {
                return parameterSlot2;
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleParametersTree(@k List<? extends ParameterSlot> list) {
        this.parameters = list;
    }

    private final void appendParameters(List<ParameterSlot> list, List<? extends ParameterSlot> list2) {
        List<ParameterSlot> parameters;
        for (ParameterSlot parameterSlot : list2) {
            list.add(parameterSlot);
            if (parameterSlot instanceof SelectParameter) {
                SelectParameter.Value selectedValue = ((SelectParameter) parameterSlot).getSelectedValue();
                if (selectedValue != null && (parameters = selectedValue.getParameters()) != null) {
                    appendParameters(list, parameters);
                }
            } else if (parameterSlot instanceof GroupParameter) {
                List<ParameterSlot> parameters2 = ((GroupParameter) parameterSlot).getParameters();
                if (parameters2 == null) {
                    parameters2 = C42784z0.f406748b;
                }
                appendParameters(list, parameters2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int countParameters(java.util.List<? extends com.avito.android.remote.model.category_parameters.base.ParameterSlot> r6) {
        /*
            r5 = this;
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
        L7:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r6.next()
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r1 = (com.avito.android.remote.model.category_parameters.base.ParameterSlot) r1
            boolean r2 = r1 instanceof com.avito.android.remote.model.category_parameters.SelectParameter
            r3 = 1
            if (r2 == 0) goto L27
            r2 = r1
            com.avito.android.remote.model.category_parameters.SelectParameter r2 = (com.avito.android.remote.model.category_parameters.SelectParameter) r2
            boolean r4 = r2.hasValue()
            if (r4 == 0) goto L27
            int r1 = r5.countParameters(r2)
        L25:
            int r3 = r3 + r1
            goto L4c
        L27:
            boolean r2 = r1 instanceof com.avito.android.remote.model.category_parameters.GroupParameter
            if (r2 == 0) goto L3d
            com.avito.android.remote.model.category_parameters.GroupParameter r1 = (com.avito.android.remote.model.category_parameters.GroupParameter) r1
            java.util.List r1 = r1.getParameters()
            if (r1 != 0) goto L35
            kotlin.collections.z0 r1 = kotlin.collections.C42784z0.f406748b
        L35:
            int r1 = r5.countParameters(r1)
            r2 = 2
            int r3 = r2 + r1
            goto L4c
        L3d:
            boolean r2 = r1 instanceof com.avito.android.remote.model.filters_parameter.slot.Slot
            if (r2 == 0) goto L4c
            com.avito.android.remote.model.filters_parameter.slot.Slot r1 = (com.avito.android.remote.model.filters_parameter.slot.Slot) r1
            java.util.List r1 = r1.getParameters()
            int r1 = r1.size()
            goto L25
        L4c:
            int r0 = r0 + r3
            goto L7
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.model.filters_parameter.SimpleParametersTree.countParameters(java.util.List):int");
    }

    private final ParameterSlot holderId(ParameterSlot parameterSlot, String str, ParameterSlot parameterSlot2) {
        if (L.f(parameterSlot != null ? parameterSlot.getId() : null, str)) {
            return parameterSlot2;
        }
        return null;
    }

    private final boolean isClearance(GroupParameter groupParameter) {
        DisplayingOptions displayingOptions;
        List<ParameterSlot> parameters = groupParameter.getParameters();
        if (parameters == null) {
            return false;
        }
        List<ParameterSlot> list = parameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (ParameterSlot parameterSlot : list) {
            String type = null;
            TextParameter textParameter = parameterSlot instanceof TextParameter ? (TextParameter) parameterSlot : null;
            if (textParameter != null && (displayingOptions = textParameter.getDisplayingOptions()) != null) {
                type = displayingOptions.getType();
            }
            if (L.f(type, "clearance")) {
                return true;
            }
        }
        return false;
    }

    private final void offer(ParameterSlot parameter, ParameterHolder holder) {
        List<ParameterSlot> parameters;
        if (parameter instanceof GroupParameter) {
            GroupParameter groupParameter = (GroupParameter) parameter;
            offer(new GroupMarkerParameter(parameter.getId(), groupParameter.getTitle(), true, groupParameter.getRichTitle(), groupParameter.getVisible(), groupParameter.getPhantom(), groupParameter.getDescription(), groupParameter.getIsNew(), null, groupParameter.getPayload(), null, isClearance(groupParameter), 1280, null), holder);
            List<ParameterSlot> parameters2 = groupParameter.getParameters();
            if (parameters2 == null) {
                parameters2 = C42784z0.f406748b;
            }
            traverseDown(parameters2, holder);
            offer(new GroupMarkerParameter(parameter.getId(), groupParameter.getTitle(), false, groupParameter.getRichTitle(), groupParameter.getVisible(), groupParameter.getPhantom(), groupParameter.getDescription(), groupParameter.getIsNew(), null, null, null, isClearance(groupParameter), 1792, null), holder);
            return;
        }
        if (holder.tryConsume(parameter)) {
            return;
        }
        holder.consumePosition();
        if (!(parameter instanceof SelectParameter)) {
            if (parameter instanceof Slot) {
                traverseDown(((Slot) parameter).getParameters(), holder);
            }
        } else {
            SelectParameter.Value selectedValue = ((SelectParameter) parameter).getSelectedValue();
            if (selectedValue == null || (parameters = selectedValue.getParameters()) == null) {
                return;
            }
            traverseDown(parameters, holder);
        }
    }

    private final ParameterSlot sameId(ParameterSlot parameterSlot, String str) {
        if (L.f(parameterSlot != null ? parameterSlot.getId() : null, str)) {
            return parameterSlot;
        }
        return null;
    }

    private final void traverseDown(List<? extends ParameterSlot> list, ParameterHolder parameterHolder) {
        for (ParameterSlot parameterSlot : list) {
            if (!parameterHolder.isValueFound()) {
                offer(parameterSlot, parameterHolder);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // com.avito.android.remote.model.filters_parameter.ParametersTree
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean applyPretendResult(@Y61.l java.util.Map<java.lang.String, ? extends com.avito.android.remote.model.PretendErrorValue> r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.model.filters_parameter.SimpleParametersTree.applyPretendResult(java.util.Map):boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (!(other instanceof ParametersTree)) {
            return false;
        }
        ParametersTree parametersTree = (ParametersTree) other;
        if (parametersTree.getCount() != getCount()) {
            return false;
        }
        int i12 = 0;
        for (ParameterSlot parameterSlot : this) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            if (!L.f(parameterSlot, parametersTree.getItem(i12))) {
                return false;
            }
            i12 = i13;
        }
        return true;
    }

    @Override // com.avito.android.remote.model.IterableParameters
    @l
    public ParameterSlot findParameter(@k String id2) {
        return findParameter(id2, new AnonymousClass1());
    }

    @l
    public final ParameterSlot findParameterHolder(@k String id2) {
        return findParameter(id2, new C343311());
    }

    @Override // com.avito.android.remote.model.IterableParameters
    @k
    public <T extends ParameterSlot> List<T> findParametersOfType(@k Class<T> type) {
        ArrayList arrayList = new ArrayList();
        for (ParameterSlot parameterSlot : this) {
            if (type.isInstance(parameterSlot)) {
                arrayList.add(parameterSlot);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            T tCast = type.cast((ParameterSlot) it.next());
            if (tCast != null) {
                arrayList2.add(tCast);
            }
        }
        return arrayList2;
    }

    @Override // com.avito.android.remote.model.filters_parameter.ParametersTree, com.avito.android.remote.model.IterableParameters, UV0.a
    public int getCount() {
        return countParameters(this.parameters);
    }

    @Override // com.avito.android.remote.model.IterableParameters
    @l
    public <T extends ParameterSlot> T getFirstParameterOfType(@k Class<T> type) {
        ParameterSlot next;
        Iterator<ParameterSlot> it = iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (type.isInstance(next)) {
                break;
            }
        }
        if (next instanceof ParameterSlot) {
            return (T) next;
        }
        return null;
    }

    @Override // com.avito.android.remote.model.filters_parameter.ParametersTree
    @k
    public List<ParameterSlot> getParametersExceptOwnedBySlots() {
        ArrayList arrayList = new ArrayList();
        appendParameters(arrayList, this.parameters);
        return arrayList;
    }

    public int hashCode() {
        Iterator<ParameterSlot> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // com.avito.android.remote.model.filters_parameter.ParametersTree, com.avito.android.remote.model.IterableParameters, UV0.a
    public boolean isEmpty() {
        return this.parameters.isEmpty();
    }

    @Override // com.avito.android.remote.model.IterableParameters, java.lang.Iterable
    @k
    public Iterator<ParameterSlot> iterator() {
        return ParametersTree.DefaultImpls.iterator(this);
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("SimpleParametersTree(parameters="), this.parameters, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.parameters, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
    }

    private final ParameterSlot findParameter(String id2, q<? super ParameterSlot, ? super String, ? super ParameterSlot, ? extends ParameterSlot> comparator) {
        ParameterSlot parameterSlotInvoke;
        ParameterSlot parameterSlotInvoke2;
        ParameterSlot parameterSlotInvoke3;
        Iterator<ParameterSlot> it = iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                break;
            }
            ParameterSlot next = it.next();
            SimpleParametersTree$findParameter$2$checkId$1 simpleParametersTree$findParameter$2$checkId$1 = new SimpleParametersTree$findParameter$2$checkId$1(comparator, next);
            parameterSlotInvoke = L.f(next != null ? next.getId() : null, id2) ? next : null;
            if (parameterSlotInvoke != null) {
                return parameterSlotInvoke;
            }
            if (next instanceof DateTimeIntervalParameter) {
                DateTimeIntervalParameter dateTimeIntervalParameter = (DateTimeIntervalParameter) next;
                DateTimeParameter start = dateTimeIntervalParameter.getStart();
                if (start != null && (parameterSlotInvoke3 = simpleParametersTree$findParameter$2$checkId$1.invoke((SimpleParametersTree$findParameter$2$checkId$1) start, (DateTimeParameter) id2)) != null) {
                    return parameterSlotInvoke3;
                }
                DateTimeParameter end = dateTimeIntervalParameter.getEnd();
                if (end != null && (parameterSlotInvoke2 = simpleParametersTree$findParameter$2$checkId$1.invoke((SimpleParametersTree$findParameter$2$checkId$1) end, (DateTimeParameter) id2)) != null) {
                    return parameterSlotInvoke2;
                }
            } else if (next instanceof CategoryAndTypeParameter) {
                for (ParameterSlot parameterSlot : ((CategoryAndTypeParameter) next).getParameters()) {
                    if (simpleParametersTree$findParameter$2$checkId$1.invoke((SimpleParametersTree$findParameter$2$checkId$1) parameterSlot, (ParameterSlot) id2) != null) {
                        return parameterSlot;
                    }
                }
            } else if (next instanceof CheckinCheckoutParameter) {
                for (ParameterSlot parameterSlot2 : ((CheckinCheckoutParameter) next).getParameters()) {
                    if (simpleParametersTree$findParameter$2$checkId$1.invoke((SimpleParametersTree$findParameter$2$checkId$1) parameterSlot2, (ParameterSlot) id2) != null) {
                        return parameterSlot2;
                    }
                }
            } else if (next instanceof Slot) {
                Iterator<T> it2 = ((Slot) next).getParameters().iterator();
                while (it2.hasNext()) {
                    parameterSlotInvoke = simpleParametersTree$findParameter$2$checkId$1.invoke((SimpleParametersTree$findParameter$2$checkId$1) it2.next(), (ParameterSlot) id2);
                    if (parameterSlotInvoke != null) {
                        break loop0;
                    }
                }
            } else {
                continue;
            }
        }
        return parameterSlotInvoke;
    }

    @Override // com.avito.android.remote.model.filters_parameter.ParametersTree, com.avito.android.remote.model.IterableParameters, UV0.a
    @k
    public ParameterSlot getItem(int position) {
        if (position > getCount() - 1) {
            throw new IndexOutOfBoundsException();
        }
        ParameterHolder parameterHolder = new ParameterHolder(position);
        traverseDown(this.parameters, parameterHolder);
        return parameterHolder.getParameter();
    }

    private final int countParameters(SelectParameter select) {
        SelectParameter.Value selectedValue = select.getSelectedValue();
        if (selectedValue == null || selectedValue.getParameters() == null || selectedValue.getParameters().isEmpty()) {
            return 0;
        }
        return countParameters(selectedValue.getParameters());
    }
}
