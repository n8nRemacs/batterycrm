package com.avito.android.mortgage.api.model.items.form;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.mortgage.api.model.FormItemValueModel;
import com.avito.android.mortgage.api.model.items.form.d;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestFormContentItemValue.kt */
@P
@s0
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bù\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010'R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b\u0007\u0010*R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b+\u0010'R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b\u000b\u0010*R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b0\u0010/R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b1\u0010/R\u001a\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b2\u0010*R\u001a\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b3\u0010*R\u001a\u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b4\u0010*R\u001a\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b5\u0010'R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b6\u0010'R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b:\u0010'R\u001a\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010>\u001a\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/form/SuggestFormContentItemValue;", "Lcom/avito/android/mortgage/api/model/items/form/d;", "Landroid/os/Parcelable;", "", "id", "name", "", "isHidden", "context", "reloadAfterUpdateMeta", "errorMeta", "isRequired", "", "shows", "discloseIn", "Lcom/avito/android/mortgage/api/model/items/form/SuggestFormFillsIn;", "fillsIn", "isMasked", "isCompact", "isDisclosed", ChannelContext.Item.PLACEHOLDER, "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedSubtitle", "title", "Lcom/avito/android/mortgage/api/model/items/form/SuggestFormSuggestType;", "suggestType", "Lcom/avito/android/mortgage/api/model/FormItemValueModel;", "value", "isUpdated", "isBannerHidden", "isUpdatedByUser", "Lcom/avito/android/printable_text/PrintableText;", "localError", "processId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/mortgage/api/model/items/form/SuggestFormSuggestType;Lcom/avito/android/mortgage/api/model/FormItemValueModel;ZZZLcom/avito/android/printable_text/PrintableText;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "Z", "()Z", "getContext", "Ljava/lang/Boolean;", "Ljava/util/List;", "getShows", "()Ljava/util/List;", "e", "f", "k", "Q0", "j", "getPlaceholder", "getSubtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Lcom/avito/android/mortgage/api/model/items/form/SuggestFormSuggestType;", "h", "()Lcom/avito/android/mortgage/api/model/items/form/SuggestFormSuggestType;", "Lcom/avito/android/mortgage/api/model/FormItemValueModel;", "i", "()Lcom/avito/android/mortgage/api/model/FormItemValueModel;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes15.dex */
public final /* data */ class SuggestFormContentItemValue implements d, Parcelable {

    @k
    public static final Parcelable.Creator<SuggestFormContentItemValue> CREATOR = new a();

    @com.google.gson.annotations.c("attributedSubtitle")
    @l
    private final AttributedText attributedSubtitle;

    /* renamed from: b, reason: collision with root package name */
    public final transient boolean f198234b;

    /* renamed from: c, reason: collision with root package name */
    public final transient boolean f198235c;

    @com.google.gson.annotations.c("context")
    @l
    private final String context;

    /* renamed from: d, reason: collision with root package name */
    public final transient boolean f198236d;

    @com.google.gson.annotations.c("discloseIn")
    @l
    private final List<String> discloseIn;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final transient PrintableText f198237e;

    @com.google.gson.annotations.c("error")
    @l
    private final String errorMeta;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final transient String f198238f;

    @com.google.gson.annotations.c("fillsIn")
    @l
    private final List<SuggestFormFillsIn> fillsIn;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isCompact")
    private final boolean isCompact;

    @com.google.gson.annotations.c("isDisclosed")
    private final boolean isDisclosed;

    @com.google.gson.annotations.c("isHidden")
    private final boolean isHidden;

    @com.google.gson.annotations.c("isMasked")
    private final boolean isMasked;

    @com.google.gson.annotations.c("isRequired")
    private final boolean isRequired;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @k
    private final String placeholder;

    @com.google.gson.annotations.c("reloadAfterUpdate")
    @l
    private final Boolean reloadAfterUpdateMeta;

    @com.google.gson.annotations.c("shows")
    @l
    private final List<String> shows;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("suggestType")
    @k
    private final SuggestFormSuggestType suggestType;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("value")
    @l
    private final FormItemValueModel value;

    /* compiled from: SuggestFormContentItemValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuggestFormContentItemValue> {
        @Override // android.os.Parcelable.Creator
        public final SuggestFormContentItemValue createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(SuggestFormFillsIn.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new SuggestFormContentItemValue(string, string2, z12, string3, boolValueOf, string4, z13, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(SuggestFormContentItemValue.class.getClassLoader()), parcel.readString(), SuggestFormSuggestType.valueOf(parcel.readString()), parcel.readInt() != 0 ? FormItemValueModel.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (PrintableText) parcel.readParcelable(SuggestFormContentItemValue.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestFormContentItemValue[] newArray(int i12) {
            return new SuggestFormContentItemValue[i12];
        }
    }

    public SuggestFormContentItemValue(@k String str, @k String str2, boolean z12, @l String str3, @l Boolean bool, @l String str4, boolean z13, @l List<String> list, @l List<String> list2, @l List<SuggestFormFillsIn> list3, boolean z14, boolean z15, boolean z16, @k String str5, @l String str6, @l AttributedText attributedText, @k String str7, @k SuggestFormSuggestType suggestFormSuggestType, @l FormItemValueModel formItemValueModel, boolean z17, boolean z18, boolean z19, @l PrintableText printableText, @l String str8) {
        this.id = str;
        this.name = str2;
        this.isHidden = z12;
        this.context = str3;
        this.reloadAfterUpdateMeta = bool;
        this.errorMeta = str4;
        this.isRequired = z13;
        this.shows = list;
        this.discloseIn = list2;
        this.fillsIn = list3;
        this.isMasked = z14;
        this.isCompact = z15;
        this.isDisclosed = z16;
        this.placeholder = str5;
        this.subtitle = str6;
        this.attributedSubtitle = attributedText;
        this.title = str7;
        this.suggestType = suggestFormSuggestType;
        this.value = formItemValueModel;
        this.f198234b = z17;
        this.f198235c = z18;
        this.f198236d = z19;
        this.f198237e = printableText;
        this.f198238f = str8;
    }

    public static SuggestFormContentItemValue a(SuggestFormContentItemValue suggestFormContentItemValue, boolean z12, boolean z13, FormItemValueModel formItemValueModel, boolean z14, boolean z15, boolean z16, PrintableText printableText, String str, int i12) {
        SuggestFormSuggestType suggestFormSuggestType;
        FormItemValueModel formItemValueModel2;
        String str2 = suggestFormContentItemValue.id;
        String str3 = suggestFormContentItemValue.name;
        boolean z17 = (i12 & 4) != 0 ? suggestFormContentItemValue.isHidden : z12;
        String str4 = suggestFormContentItemValue.context;
        Boolean bool = suggestFormContentItemValue.reloadAfterUpdateMeta;
        String str5 = (i12 & 32) != 0 ? suggestFormContentItemValue.errorMeta : null;
        boolean z18 = (i12 & 64) != 0 ? suggestFormContentItemValue.isRequired : z13;
        List<String> list = suggestFormContentItemValue.shows;
        List<String> list2 = suggestFormContentItemValue.discloseIn;
        List<SuggestFormFillsIn> list3 = suggestFormContentItemValue.fillsIn;
        boolean z19 = (i12 & 1024) != 0 ? suggestFormContentItemValue.isMasked : false;
        boolean z22 = suggestFormContentItemValue.isCompact;
        boolean z23 = (i12 & 4096) != 0 ? suggestFormContentItemValue.isDisclosed : true;
        String str6 = suggestFormContentItemValue.placeholder;
        String str7 = suggestFormContentItemValue.subtitle;
        AttributedText attributedText = suggestFormContentItemValue.attributedSubtitle;
        String str8 = suggestFormContentItemValue.title;
        SuggestFormSuggestType suggestFormSuggestType2 = suggestFormContentItemValue.suggestType;
        if ((i12 & 262144) != 0) {
            suggestFormSuggestType = suggestFormSuggestType2;
            formItemValueModel2 = suggestFormContentItemValue.value;
        } else {
            suggestFormSuggestType = suggestFormSuggestType2;
            formItemValueModel2 = formItemValueModel;
        }
        boolean z24 = (524288 & i12) != 0 ? suggestFormContentItemValue.f198234b : z14;
        boolean z25 = (1048576 & i12) != 0 ? suggestFormContentItemValue.f198235c : z15;
        boolean z26 = (2097152 & i12) != 0 ? suggestFormContentItemValue.f198236d : z16;
        PrintableText printableText2 = (4194304 & i12) != 0 ? suggestFormContentItemValue.f198237e : printableText;
        String str9 = (i12 & 8388608) != 0 ? suggestFormContentItemValue.f198238f : str;
        suggestFormContentItemValue.getClass();
        return new SuggestFormContentItemValue(str2, str3, z17, str4, bool, str5, z18, list, list2, list3, z19, z22, z23, str6, str7, attributedText, str8, suggestFormSuggestType, formItemValueModel2, z24, z25, z26, printableText2, str9);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d G2(@l PrintableText printableText) {
        return a(this, false, false, null, false, false, false, printableText, null, 12582911);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d H2(boolean z12) {
        return a(this, z12, false, null, false, false, false, null, null, 16777211);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final List<String> I2() {
        if (this.isHidden) {
            return C42784z0.f406748b;
        }
        FormItemValueModel formItemValueModel = this.value;
        String value = formItemValueModel != null ? formItemValueModel.getValue() : null;
        if (value != null && value.length() != 0 && !this.isDisclosed) {
            Collection collection = this.shows;
            if (collection == null) {
                collection = C42784z0.f406748b;
            }
            return C42745f0.h0(g(), collection);
        }
        if (!this.isDisclosed) {
            return C42784z0.f406748b;
        }
        Collection collection2 = this.shows;
        if (collection2 == null) {
            collection2 = C42784z0.f406748b;
        }
        Collection collection3 = collection2;
        Iterable iterable = this.discloseIn;
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        return C42745f0.h0(g(), C42745f0.h0(iterable, collection3));
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: J2, reason: from getter */
    public final boolean getF198254b() {
        return this.f198234b;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final List<List<String>> L2() {
        if (this.isHidden) {
            Collection collection = this.shows;
            if (collection == null) {
                collection = C42784z0.f406748b;
            }
            ArrayList arrayListH0 = C42745f0.h0(g(), collection);
            Iterable iterable = this.discloseIn;
            if (iterable == null) {
                iterable = C42784z0.f406748b;
            }
            return Collections.singletonList(C42745f0.h0(iterable, arrayListH0));
        }
        FormItemValueModel formItemValueModel = this.value;
        String value = formItemValueModel != null ? formItemValueModel.getValue() : null;
        if (value != null && value.length() != 0) {
            return C42784z0.f406748b;
        }
        Collection collection2 = this.shows;
        if (collection2 == null) {
            collection2 = C42784z0.f406748b;
        }
        Collection collection3 = collection2;
        Iterable iterable2 = this.discloseIn;
        if (iterable2 == null) {
            iterable2 = C42784z0.f406748b;
        }
        return Collections.singletonList(C42745f0.h0(g(), C42745f0.h0(iterable2, collection3)));
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d M2(boolean z12) {
        return a(this, false, false, null, z12, false, false, null, z12 ? this.f198238f : null, 7864319);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    /* renamed from: N2, reason: from getter */
    public final String getF198257e() {
        return this.f198238f;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final int P2() {
        return d.a.a(this);
    }

    /* renamed from: Q0, reason: from getter */
    public final boolean getIsCompact() {
        return this.isCompact;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d Q2(@l String str) {
        return a(this, false, false, null, false, false, false, null, str, 8388607);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: S2, reason: from getter */
    public final boolean getF198255c() {
        return this.f198236d;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean U2() {
        Boolean bool = this.reloadAfterUpdateMeta;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @k
    public final SuggestFormContentItemValue c() {
        return a(l("", null, false), false, false, null, false, true, false, null, null, 15724543);
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<String> e() {
        return this.discloseIn;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestFormContentItemValue)) {
            return false;
        }
        SuggestFormContentItemValue suggestFormContentItemValue = (SuggestFormContentItemValue) obj;
        return L.f(this.id, suggestFormContentItemValue.id) && L.f(this.name, suggestFormContentItemValue.name) && this.isHidden == suggestFormContentItemValue.isHidden && L.f(this.context, suggestFormContentItemValue.context) && L.f(this.reloadAfterUpdateMeta, suggestFormContentItemValue.reloadAfterUpdateMeta) && L.f(this.errorMeta, suggestFormContentItemValue.errorMeta) && this.isRequired == suggestFormContentItemValue.isRequired && L.f(this.shows, suggestFormContentItemValue.shows) && L.f(this.discloseIn, suggestFormContentItemValue.discloseIn) && L.f(this.fillsIn, suggestFormContentItemValue.fillsIn) && this.isMasked == suggestFormContentItemValue.isMasked && this.isCompact == suggestFormContentItemValue.isCompact && this.isDisclosed == suggestFormContentItemValue.isDisclosed && L.f(this.placeholder, suggestFormContentItemValue.placeholder) && L.f(this.subtitle, suggestFormContentItemValue.subtitle) && L.f(this.attributedSubtitle, suggestFormContentItemValue.attributedSubtitle) && L.f(this.title, suggestFormContentItemValue.title) && this.suggestType == suggestFormContentItemValue.suggestType && L.f(this.value, suggestFormContentItemValue.value) && this.f198234b == suggestFormContentItemValue.f198234b && this.f198235c == suggestFormContentItemValue.f198235c && this.f198236d == suggestFormContentItemValue.f198236d && L.f(this.f198237e, suggestFormContentItemValue.f198237e) && L.f(this.f198238f, suggestFormContentItemValue.f198238f);
    }

    @l
    public final List<SuggestFormFillsIn> f() {
        return this.fillsIn;
    }

    @k
    public final List<String> g() {
        ArrayList arrayList;
        List<SuggestFormFillsIn> list = this.fillsIn;
        if (list != null) {
            List<SuggestFormFillsIn> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((SuggestFormFillsIn) it.next()).getId());
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? C42784z0.f406748b : arrayList;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    public final String getContext() {
        return this.context;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    public final PrintableText getError() {
        PrintableText printableText = this.f198237e;
        if (printableText != null) {
            return printableText;
        }
        String str = this.errorMeta;
        if (str == null || str.length() == 0) {
            return null;
        }
        return com.avito.android.printable_text.b.f(this.errorMeta);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final String getId() {
        return this.id;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final SuggestFormSuggestType getSuggestType() {
        return this.suggestType;
    }

    public final int hashCode() {
        int i12 = r.i(H.d(this.id.hashCode() * 31, 31, this.name), 31, this.isHidden);
        String str = this.context;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.reloadAfterUpdateMeta;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.errorMeta;
        int i13 = r.i((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isRequired);
        List<String> list = this.shows;
        int iHashCode3 = (i13 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.discloseIn;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<SuggestFormFillsIn> list3 = this.fillsIn;
        int iD2 = H.d(r.i(r.i(r.i((iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.isMasked), 31, this.isCompact), 31, this.isDisclosed), 31, this.placeholder);
        String str3 = this.subtitle;
        int iHashCode5 = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AttributedText attributedText = this.attributedSubtitle;
        int iHashCode6 = (this.suggestType.hashCode() + H.d((iHashCode5 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.title)) * 31;
        FormItemValueModel formItemValueModel = this.value;
        int i14 = r.i(r.i(r.i((iHashCode6 + (formItemValueModel == null ? 0 : formItemValueModel.hashCode())) * 31, 31, this.f198234b), 31, this.f198235c), 31, this.f198236d);
        PrintableText printableText = this.f198237e;
        int iHashCode7 = (i14 + (printableText == null ? 0 : printableText.hashCode())) * 31;
        String str4 = this.f198238f;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final FormItemValueModel getValue() {
        return this.value;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean isEmpty() {
        FormItemValueModel formItemValueModel = this.value;
        String value = formItemValueModel != null ? formItemValueModel.getValue() : null;
        return value == null || value.length() == 0;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: isHidden, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean isValid() {
        return (this.isRequired && !this.isHidden && isEmpty()) ? false : true;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsDisclosed() {
        return this.isDisclosed;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsMasked() {
        return this.isMasked;
    }

    @k
    public final SuggestFormContentItemValue l(@k String str, @l Suggestion suggestion, boolean z12) {
        FormItemValueModel formItemValueModel = this.value;
        return (str.equals(formItemValueModel != null ? formItemValueModel.getValue() : null) && L.f(suggestion, this.value.getData())) ? this : a(this, false, false, new FormItemValueModel(suggestion, str), true, false, z12, null, null, 8649695);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestFormContentItemValue(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", isHidden=");
        sb2.append(this.isHidden);
        sb2.append(", context=");
        sb2.append(this.context);
        sb2.append(", reloadAfterUpdateMeta=");
        sb2.append(this.reloadAfterUpdateMeta);
        sb2.append(", errorMeta=");
        sb2.append(this.errorMeta);
        sb2.append(", isRequired=");
        sb2.append(this.isRequired);
        sb2.append(", shows=");
        sb2.append(this.shows);
        sb2.append(", discloseIn=");
        sb2.append(this.discloseIn);
        sb2.append(", fillsIn=");
        sb2.append(this.fillsIn);
        sb2.append(", isMasked=");
        sb2.append(this.isMasked);
        sb2.append(", isCompact=");
        sb2.append(this.isCompact);
        sb2.append(", isDisclosed=");
        sb2.append(this.isDisclosed);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.attributedSubtitle);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", suggestType=");
        sb2.append(this.suggestType);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", isUpdated=");
        sb2.append(this.f198234b);
        sb2.append(", isBannerHidden=");
        sb2.append(this.f198235c);
        sb2.append(", isUpdatedByUser=");
        sb2.append(this.f198236d);
        sb2.append(", localError=");
        sb2.append(this.f198237e);
        sb2.append(", processId=");
        return C22026a.c(sb2, this.f198238f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.isHidden ? 1 : 0);
        parcel.writeString(this.context);
        Boolean bool = this.reloadAfterUpdateMeta;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.errorMeta);
        parcel.writeInt(this.isRequired ? 1 : 0);
        parcel.writeStringList(this.shows);
        parcel.writeStringList(this.discloseIn);
        List<SuggestFormFillsIn> list = this.fillsIn;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((SuggestFormFillsIn) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeInt(this.isMasked ? 1 : 0);
        parcel.writeInt(this.isCompact ? 1 : 0);
        parcel.writeInt(this.isDisclosed ? 1 : 0);
        parcel.writeString(this.placeholder);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.attributedSubtitle, i12);
        parcel.writeString(this.title);
        parcel.writeString(this.suggestType.name());
        FormItemValueModel formItemValueModel = this.value;
        if (formItemValueModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formItemValueModel.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f198234b ? 1 : 0);
        parcel.writeInt(this.f198235c ? 1 : 0);
        parcel.writeInt(this.f198236d ? 1 : 0);
        parcel.writeParcelable(this.f198237e, i12);
        parcel.writeString(this.f198238f);
    }

    public /* synthetic */ SuggestFormContentItemValue(String str, String str2, boolean z12, String str3, Boolean bool, String str4, boolean z13, List list, List list2, List list3, boolean z14, boolean z15, boolean z16, String str5, String str6, AttributedText attributedText, String str7, SuggestFormSuggestType suggestFormSuggestType, FormItemValueModel formItemValueModel, boolean z17, boolean z18, boolean z19, PrintableText printableText, String str8, int i12, C42822w c42822w) {
        this(str, str2, z12, str3, bool, str4, z13, list, list2, list3, z14, z15, z16, str5, str6, attributedText, str7, suggestFormSuggestType, formItemValueModel, (i12 & 524288) != 0 ? false : z17, (i12 & 1048576) != 0 ? false : z18, (i12 & 2097152) != 0 ? false : z19, (i12 & 4194304) != 0 ? null : printableText, (i12 & 8388608) != 0 ? null : str8);
    }
}
