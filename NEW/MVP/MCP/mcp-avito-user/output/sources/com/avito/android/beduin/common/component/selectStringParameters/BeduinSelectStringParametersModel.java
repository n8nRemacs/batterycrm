package com.avito.android.beduin.common.component.selectStringParameters;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.input.j;
import com.avito.android.beduin.common.component.input.k;
import com.avito.android.beduin.common.component.q;
import com.avito.android.beduin.common.form.transforms.ActionsTransform;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.ErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
import com.avito.android.beduin.common.form.transforms.ParametersTransform;
import com.avito.android.beduin.common.form.transforms.SelectItemsTransform;
import com.avito.android.beduin.common.form.transforms.StringParametersTransform;
import com.avito.android.beduin.network.model.Constraint;
import com.avito.android.beduin.network.model.SelectValue;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: BeduinSelectStringParametersModel.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/selectStringParameters/BeduinSelectStringParametersModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin/common/component/q;", "Lcom/avito/android/beduin/network/parse/a;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSelectStringParametersModel extends LeafBeduinModel implements q, com.avito.android.beduin.network.parse.a {

    @k
    public static final Parcelable.Creator<BeduinSelectStringParametersModel> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f102395b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f102396c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DisplayingPredicate f102397d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final BeduinComponentTheme f102398e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f102399f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final SelectValue f102400g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f102401h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f102402i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f102403j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final SelectItem f102404k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final SelectItem f102405l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Boolean f102406m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final List<BeduinAction> f102407n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final Integer f102408o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final String f102409p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final List<Constraint> f102410q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final List<BeduinAction> f102411r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final Boolean f102412s;

    /* compiled from: BeduinSelectStringParametersModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/common/component/selectStringParameters/BeduinSelectStringParametersModel$a;", "", "<init>", "()V", "", "PAYMENT_SOURCE_ID_PARAM", "Ljava/lang/String;", "STYLE_PAYMENT_CARD", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinSelectStringParametersModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinSelectStringParametersModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSelectStringParametersModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            Boolean bool;
            Integer num;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinSelectStringParametersModel.class.getClassLoader());
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            SelectValue selectValueCreateFromParcel = parcel.readInt() == 0 ? null : SelectValue.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            SelectItem selectItemCreateFromParcel = parcel.readInt() == 0 ? null : SelectItem.CREATOR.createFromParcel(parcel);
            SelectItem selectItemCreateFromParcel2 = parcel.readInt() == 0 ? null : SelectItem.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool = boolValueOf;
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                bool = boolValueOf;
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinSelectStringParametersModel.class, parcel, arrayList, iL2, 1);
                    i12 = i12;
                }
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                num = numValueOf;
                arrayList2 = arrayList;
                arrayList3 = null;
            } else {
                int i13 = parcel.readInt();
                num = numValueOf;
                ArrayList arrayList5 = new ArrayList(i13);
                arrayList2 = arrayList;
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinSelectStringParametersModel.class, parcel, arrayList5, iL3, 1);
                    i13 = i13;
                }
                arrayList3 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                int iL4 = 0;
                while (iL4 != i14) {
                    iL4 = com.avito.android.actions_sheet.a.l(BeduinSelectStringParametersModel.class, parcel, arrayList6, iL4, 1);
                    i14 = i14;
                }
                arrayList4 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinSelectStringParametersModel(string, string2, displayingPredicate, beduinComponentThemeCreateFromParcel, string3, selectValueCreateFromParcel, string4, string5, string6, selectItemCreateFromParcel, selectItemCreateFromParcel2, bool, arrayList2, num, string7, arrayList3, arrayList4, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSelectStringParametersModel[] newArray(int i12) {
            return new BeduinSelectStringParametersModel[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ BeduinSelectStringParametersModel(String str, String str2, DisplayingPredicate displayingPredicate, BeduinComponentTheme beduinComponentTheme, String str3, SelectValue selectValue, String str4, String str5, String str6, SelectItem selectItem, SelectItem selectItem2, Boolean bool, List list, Integer num, String str7, List list2, List list3, Boolean bool2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? UUID.randomUUID().toString() : str2, displayingPredicate, beduinComponentTheme, str3, selectValue, str4, str5, str6, selectItem, selectItem2, bool, list, num, str7, list2, list3, bool2);
    }

    public static BeduinSelectStringParametersModel a(BeduinSelectStringParametersModel beduinSelectStringParametersModel, DisplayingPredicate displayingPredicate, String str, SelectValue selectValue, String str2, SelectItem selectItem, SelectItem selectItem2, String str3, List list, Boolean bool, int i12) {
        List<Constraint> list2;
        List list3;
        String str4 = beduinSelectStringParametersModel.f102395b;
        String str5 = beduinSelectStringParametersModel.f102396c;
        DisplayingPredicate displayingPredicate2 = (i12 & 4) != 0 ? beduinSelectStringParametersModel.f102397d : displayingPredicate;
        BeduinComponentTheme beduinComponentTheme = beduinSelectStringParametersModel.f102398e;
        String str6 = (i12 & 16) != 0 ? beduinSelectStringParametersModel.f102399f : str;
        SelectValue selectValue2 = (i12 & 32) != 0 ? beduinSelectStringParametersModel.f102400g : selectValue;
        String str7 = (i12 & 64) != 0 ? beduinSelectStringParametersModel.f102401h : str2;
        String str8 = beduinSelectStringParametersModel.f102402i;
        String str9 = beduinSelectStringParametersModel.f102403j;
        SelectItem selectItem3 = (i12 & 512) != 0 ? beduinSelectStringParametersModel.f102404k : selectItem;
        SelectItem selectItem4 = (i12 & 1024) != 0 ? beduinSelectStringParametersModel.f102405l : selectItem2;
        Boolean bool2 = beduinSelectStringParametersModel.f102406m;
        List<BeduinAction> list4 = beduinSelectStringParametersModel.f102407n;
        Integer num = beduinSelectStringParametersModel.f102408o;
        String str10 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? beduinSelectStringParametersModel.f102409p : str3;
        List<Constraint> list5 = beduinSelectStringParametersModel.f102410q;
        if ((i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0) {
            list2 = list5;
            list3 = beduinSelectStringParametersModel.f102411r;
        } else {
            list2 = list5;
            list3 = list;
        }
        Boolean bool3 = (i12 & 131072) != 0 ? beduinSelectStringParametersModel.f102412s : bool;
        beduinSelectStringParametersModel.getClass();
        return new BeduinSelectStringParametersModel(str4, str5, displayingPredicate2, beduinComponentTheme, str6, selectValue2, str7, str8, str9, selectItem3, selectItem4, bool2, list4, num, str10, list2, list3, bool3);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    public final BeduinModel apply(BeduinModelTransform beduinModelTransform) {
        if (beduinModelTransform instanceof DisplayPredicateTransform) {
            return a(this, ((DisplayPredicateTransform) beduinModelTransform).getDisplayingPredicate(), null, null, null, null, null, null, null, null, 262139);
        }
        if (beduinModelTransform instanceof TextTransform) {
            return a(this, null, null, null, ((TextTransform) beduinModelTransform).getText(), null, null, null, null, null, 262079).validateModelByConstraints();
        }
        if (beduinModelTransform instanceof ActionsTransform) {
            return a(this, null, null, null, null, null, null, null, ((ActionsTransform) beduinModelTransform).getActions(), null, 196607);
        }
        boolean z12 = beduinModelTransform instanceof StringParametersTransform;
        SelectValue selectValue = this.f102400g;
        if (z12) {
            return a(this, null, null, new SelectValue(selectValue != null ? selectValue.getConstraints() : null, ((StringParametersTransform) beduinModelTransform).getParameters()), null, null, null, null, null, null, 262111).validateModelByConstraints();
        }
        if (beduinModelTransform instanceof ErrorMessageTransform) {
            return a(this, null, null, null, null, null, null, ((ErrorMessageTransform) beduinModelTransform).getErrorMessage(), null, null, 245759);
        }
        if (beduinModelTransform instanceof SelectItemsTransform) {
            SelectItemsTransform selectItemsTransform = (SelectItemsTransform) beduinModelTransform;
            return a(this, null, null, null, null, selectItemsTransform.getLeftItem(), selectItemsTransform.getRightItem(), null, null, null, 260607);
        }
        if (!(beduinModelTransform instanceof ParametersTransform)) {
            return beduinModelTransform instanceof IsEnabledTransform ? a(this, null, null, null, null, null, null, null, null, Boolean.valueOf(((IsEnabledTransform) beduinModelTransform).isEnabled()), 131071) : this;
        }
        Map<String, List<Constraint>> constraints = selectValue != null ? selectValue.getConstraints() : null;
        Map<String, Object> parameters = ((ParametersTransform) beduinModelTransform).getParameters();
        if (parameters != null) {
            linkedHashMap = new LinkedHashMap(P0.f(parameters.size()));
            Iterator<T> it = parameters.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return a(this, null, null, new SelectValue(constraints, linkedHashMap), null, null, null, null, null, null, 262111);
    }

    @Override // com.avito.android.beduin.common.component.q
    @k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final BeduinSelectStringParametersModel validateModelByConstraints() {
        List list = this.f102410q;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        String str = this.f102401h;
        if (str == null) {
            str = "";
        }
        com.avito.android.beduin.common.component.input.k kVarB = j.b(str, null, list);
        if (L.f(kVarB, k.b.f101561a)) {
            kVarB = d();
        }
        return a(this, null, null, null, null, null, null, j.a(kVarB), null, null, 245759);
    }

    public final com.avito.android.beduin.common.component.input.k d() {
        SelectValue selectValue = this.f102400g;
        Map<String, String> parameters = selectValue != null ? selectValue.getParameters() : null;
        if (parameters == null) {
            parameters = P0.c();
        }
        Map<String, List<Constraint>> constraints = selectValue != null ? selectValue.getConstraints() : null;
        if (constraints == null) {
            constraints = P0.c();
        }
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            com.avito.android.beduin.common.component.input.k kVarB = j.b(entry.getValue(), null, constraints.get(entry.getKey()));
            if (!L.f(kVarB, k.b.f101561a)) {
                return kVarB;
            }
        }
        return k.b.f101561a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinSelectStringParametersModel)) {
            return false;
        }
        BeduinSelectStringParametersModel beduinSelectStringParametersModel = (BeduinSelectStringParametersModel) obj;
        return L.f(this.f102395b, beduinSelectStringParametersModel.f102395b) && L.f(this.f102396c, beduinSelectStringParametersModel.f102396c) && L.f(this.f102397d, beduinSelectStringParametersModel.f102397d) && this.f102398e == beduinSelectStringParametersModel.f102398e && L.f(this.f102399f, beduinSelectStringParametersModel.f102399f) && L.f(this.f102400g, beduinSelectStringParametersModel.f102400g) && L.f(this.f102401h, beduinSelectStringParametersModel.f102401h) && L.f(this.f102402i, beduinSelectStringParametersModel.f102402i) && L.f(this.f102403j, beduinSelectStringParametersModel.f102403j) && L.f(this.f102404k, beduinSelectStringParametersModel.f102404k) && L.f(this.f102405l, beduinSelectStringParametersModel.f102405l) && L.f(this.f102406m, beduinSelectStringParametersModel.f102406m) && L.f(this.f102407n, beduinSelectStringParametersModel.f102407n) && L.f(this.f102408o, beduinSelectStringParametersModel.f102408o) && L.f(this.f102409p, beduinSelectStringParametersModel.f102409p) && L.f(this.f102410q, beduinSelectStringParametersModel.f102410q) && L.f(this.f102411r, beduinSelectStringParametersModel.f102411r) && L.f(this.f102412s, beduinSelectStringParametersModel.f102412s);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate, reason: from getter */
    public final DisplayingPredicate getF102945c() {
        return this.f102397d;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    /* renamed from: getId */
    public final String getF102944b() {
        String str = this.f102395b;
        return str == null ? this.f102396c : str;
    }

    public final int hashCode() {
        String str = this.f102395b;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f102396c);
        DisplayingPredicate displayingPredicate = this.f102397d;
        int iHashCode = (iD2 + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.f102398e;
        int iHashCode2 = (iHashCode + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        String str2 = this.f102399f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SelectValue selectValue = this.f102400g;
        int iHashCode4 = (iHashCode3 + (selectValue == null ? 0 : selectValue.hashCode())) * 31;
        String str3 = this.f102401h;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f102402i;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f102403j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        SelectItem selectItem = this.f102404k;
        int iHashCode8 = (iHashCode7 + (selectItem == null ? 0 : selectItem.hashCode())) * 31;
        SelectItem selectItem2 = this.f102405l;
        int iHashCode9 = (iHashCode8 + (selectItem2 == null ? 0 : selectItem2.hashCode())) * 31;
        Boolean bool = this.f102406m;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<BeduinAction> list = this.f102407n;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f102408o;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f102409p;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<Constraint> list2 = this.f102410q;
        int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BeduinAction> list3 = this.f102411r;
        int iHashCode15 = (iHashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool2 = this.f102412s;
        return iHashCode15 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    public final boolean isValid() {
        String str = this.f102409p;
        if (str == null || str.length() == 0) {
            com.avito.android.beduin.common.component.input.k kVarD = d();
            k.b bVar = k.b.f101561a;
            if (L.f(kVarD, bVar)) {
                List list = this.f102410q;
                if (list == null) {
                    list = C42784z0.f406748b;
                }
                String str2 = this.f102401h;
                if (str2 == null) {
                    str2 = "";
                }
                if (L.f(j.b(str2, null, list), bVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinSelectStringParametersModel(_id=");
        sb2.append(this.f102395b);
        sb2.append(", localId=");
        sb2.append(this.f102396c);
        sb2.append(", displayingPredicate=");
        sb2.append(this.f102397d);
        sb2.append(", theme=");
        sb2.append(this.f102398e);
        sb2.append(", style=");
        sb2.append(this.f102399f);
        sb2.append(", selectValue=");
        sb2.append(this.f102400g);
        sb2.append(", text=");
        sb2.append(this.f102401h);
        sb2.append(", details=");
        sb2.append(this.f102402i);
        sb2.append(", placeholder=");
        sb2.append(this.f102403j);
        sb2.append(", leftItem=");
        sb2.append(this.f102404k);
        sb2.append(", rightItem=");
        sb2.append(this.f102405l);
        sb2.append(", showClearButton=");
        sb2.append(this.f102406m);
        sb2.append(", onClearedActions=");
        sb2.append(this.f102407n);
        sb2.append(", maximumLinesNumber=");
        sb2.append(this.f102408o);
        sb2.append(", errorMessage=");
        sb2.append(this.f102409p);
        sb2.append(", constraints=");
        sb2.append(this.f102410q);
        sb2.append(", actions=");
        sb2.append(this.f102411r);
        sb2.append(", isEnabled=");
        return C0.g(sb2, this.f102412s, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f102395b);
        parcel.writeString(this.f102396c);
        parcel.writeParcelable(this.f102397d, i12);
        BeduinComponentTheme beduinComponentTheme = this.f102398e;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f102399f);
        SelectValue selectValue = this.f102400g;
        if (selectValue == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectValue.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f102401h);
        parcel.writeString(this.f102402i);
        parcel.writeString(this.f102403j);
        SelectItem selectItem = this.f102404k;
        if (selectItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectItem.writeToParcel(parcel, i12);
        }
        SelectItem selectItem2 = this.f102405l;
        if (selectItem2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectItem2.writeToParcel(parcel, i12);
        }
        Boolean bool = this.f102406m;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<BeduinAction> list = this.f102407n;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        Integer num = this.f102408o;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f102409p);
        List<Constraint> list2 = this.f102410q;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        List<BeduinAction> list3 = this.f102411r;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), i12);
            }
        }
        Boolean bool2 = this.f102412s;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinSelectStringParametersModel(@l String str, @Y61.k String str2, @l DisplayingPredicate displayingPredicate, @l BeduinComponentTheme beduinComponentTheme, @l String str3, @l SelectValue selectValue, @l String str4, @l String str5, @l String str6, @l SelectItem selectItem, @l SelectItem selectItem2, @l Boolean bool, @l List<? extends BeduinAction> list, @l Integer num, @l String str7, @l List<? extends Constraint> list2, @l List<? extends BeduinAction> list3, @l Boolean bool2) {
        this.f102395b = str;
        this.f102396c = str2;
        this.f102397d = displayingPredicate;
        this.f102398e = beduinComponentTheme;
        this.f102399f = str3;
        this.f102400g = selectValue;
        this.f102401h = str4;
        this.f102402i = str5;
        this.f102403j = str6;
        this.f102404k = selectItem;
        this.f102405l = selectItem2;
        this.f102406m = bool;
        this.f102407n = list;
        this.f102408o = num;
        this.f102409p = str7;
        this.f102410q = list2;
        this.f102411r = list3;
        this.f102412s = bool2;
    }
}
