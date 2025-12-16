package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LeasingCalculator.kt */
@d
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0005JKLMNBw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0094\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0017J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020)HÖ\u0001¢\u0006\u0004\b1\u0010+J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020)HÖ\u0001¢\u0006\u0004\b6\u00107R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b<\u0010\u0019R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010\u001c\"\u0004\b?\u0010@R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\bA\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\bB\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\bE\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010#R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bI\u0010%¨\u0006O"}, d2 = {"Lcom/avito/android/remote/model/LeasingCalculator;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingInputTerm;", "downPayment", "period", "", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer;", "offers", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingBenefit;", "benefits", "applicationButtonText", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo;", "leasingInfo", "applicationLink", "Lcom/avito/android/deep_linking/links/DeepLink;", "applicationFormLink", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication;", "application", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/LeasingCalculator$LeasingInputTerm;Lcom/avito/android/remote/model/LeasingCalculator$LeasingInputTerm;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/LeasingCalculator$LeasingInputTerm;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo;", "component8", "component9", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component10", "()Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/LeasingCalculator$LeasingInputTerm;Lcom/avito/android/remote/model/LeasingCalculator$LeasingInputTerm;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication;)Lcom/avito/android/remote/model/LeasingCalculator;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingInputTerm;", "getDownPayment", "getPeriod", "Ljava/util/List;", "getOffers", "setOffers", "(Ljava/util/List;)V", "getBenefits", "getApplicationButtonText", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo;", "getLeasingInfo", "getApplicationLink", "Lcom/avito/android/deep_linking/links/DeepLink;", "getApplicationFormLink", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication;", "getApplication", "LeasingApplication", "LeasingBenefit", "LeasingInfo", "LeasingInputTerm", "LeasingOffer", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LeasingCalculator implements Parcelable {

    @k
    public static final Parcelable.Creator<LeasingCalculator> CREATOR = new Creator();

    @c("application")
    @l
    private final LeasingApplication application;

    @c("toApplicationButton")
    @l
    private final String applicationButtonText;

    @c("applicationFormDeepLink")
    @l
    private final DeepLink applicationFormLink;

    @c("applicationDeepLink")
    @l
    private final String applicationLink;

    @c("benefits")
    @l
    private final List<LeasingBenefit> benefits;

    @c("downPayment")
    @l
    private final LeasingInputTerm downPayment;

    @c("howItWorks")
    @l
    private final LeasingInfo leasingInfo;

    @c("offers")
    @l
    private List<LeasingOffer> offers;

    @c("term")
    @l
    private final LeasingInputTerm period;

    @c("title")
    @l
    private final String title;

    /* compiled from: LeasingCalculator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LeasingCalculator> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LeasingCalculator createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            LeasingInputTerm leasingInputTermCreateFromParcel = parcel.readInt() == 0 ? null : LeasingInputTerm.CREATOR.createFromParcel(parcel);
            LeasingInputTerm leasingInputTermCreateFromParcel2 = parcel.readInt() == 0 ? null : LeasingInputTerm.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(LeasingOffer.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(LeasingBenefit.CREATOR, parcel, arrayList3, iC2, 1);
                }
                arrayList2 = arrayList3;
            }
            return new LeasingCalculator(string, leasingInputTermCreateFromParcel, leasingInputTermCreateFromParcel2, arrayList, arrayList2, parcel.readString(), parcel.readInt() == 0 ? null : LeasingInfo.CREATOR.createFromParcel(parcel), parcel.readString(), (DeepLink) parcel.readParcelable(LeasingCalculator.class.getClassLoader()), parcel.readInt() != 0 ? LeasingApplication.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LeasingCalculator[] newArray(int i12) {
            return new LeasingCalculator[i12];
        }
    }

    /* compiled from: LeasingCalculator.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u000212BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0015¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationField;", "inn", "phone", "sendButtonText", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationAgreement;", "agreement", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationField;Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationField;Ljava/lang/String;Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationAgreement;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationField;", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationAgreement;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationField;Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationField;Ljava/lang/String;Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationAgreement;)Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationField;", "getInn", "getPhone", "getSendButtonText", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationAgreement;", "getAgreement", "ApplicationAgreement", "ApplicationField", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class LeasingApplication implements Parcelable {

        @k
        public static final Parcelable.Creator<LeasingApplication> CREATOR = new Creator();

        @c("agreement")
        @l
        private final ApplicationAgreement agreement;

        @c("description")
        @l
        private final String description;

        @c("inn")
        @l
        private final ApplicationField inn;

        @c("phone")
        @l
        private final ApplicationField phone;

        @c("sendApplicationButton")
        @l
        private final String sendButtonText;

        @c("title")
        @l
        private final String title;

        /* compiled from: LeasingCalculator.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationAgreement;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationAgreement$AgreementLink;", "link", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationAgreement$AgreementLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationAgreement$AgreementLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationAgreement$AgreementLink;)Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationAgreement;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationAgreement$AgreementLink;", "getLink", "AgreementLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class ApplicationAgreement implements Parcelable {

            @k
            public static final Parcelable.Creator<ApplicationAgreement> CREATOR = new Creator();

            @c("link")
            @l
            private final AgreementLink link;

            @c("title")
            @l
            private final String title;

            /* compiled from: LeasingCalculator.kt */
            @d
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationAgreement$AgreementLink;", "Landroid/os/Parcelable;", "", "title", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationAgreement$AgreementLink;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class AgreementLink implements Parcelable {

                @k
                public static final Parcelable.Creator<AgreementLink> CREATOR = new Creator();

                @c("title")
                @l
                private final String title;

                @c("value")
                @l
                private final String value;

                /* compiled from: LeasingCalculator.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<AgreementLink> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final AgreementLink createFromParcel(@k Parcel parcel) {
                        return new AgreementLink(parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final AgreementLink[] newArray(int i12) {
                        return new AgreementLink[i12];
                    }
                }

                public AgreementLink(@l String str, @l String str2) {
                    this.title = str;
                    this.value = str2;
                }

                public static /* synthetic */ AgreementLink copy$default(AgreementLink agreementLink, String str, String str2, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = agreementLink.title;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = agreementLink.value;
                    }
                    return agreementLink.copy(str, str2);
                }

                @l
                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @l
                /* renamed from: component2, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                @k
                public final AgreementLink copy(@l String title, @l String value) {
                    return new AgreementLink(title, value);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AgreementLink)) {
                        return false;
                    }
                    AgreementLink agreementLink = (AgreementLink) other;
                    return L.f(this.title, agreementLink.title) && L.f(this.value, agreementLink.value);
                }

                @l
                public final String getTitle() {
                    return this.title;
                }

                @l
                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    String str = this.title;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.value;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("AgreementLink(title=");
                    sb2.append(this.title);
                    sb2.append(", value=");
                    return C22026a.c(sb2, this.value, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.title);
                    parcel.writeString(this.value);
                }
            }

            /* compiled from: LeasingCalculator.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ApplicationAgreement> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ApplicationAgreement createFromParcel(@k Parcel parcel) {
                    return new ApplicationAgreement(parcel.readString(), parcel.readInt() == 0 ? null : AgreementLink.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ApplicationAgreement[] newArray(int i12) {
                    return new ApplicationAgreement[i12];
                }
            }

            public ApplicationAgreement(@l String str, @l AgreementLink agreementLink) {
                this.title = str;
                this.link = agreementLink;
            }

            public static /* synthetic */ ApplicationAgreement copy$default(ApplicationAgreement applicationAgreement, String str, AgreementLink agreementLink, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = applicationAgreement.title;
                }
                if ((i12 & 2) != 0) {
                    agreementLink = applicationAgreement.link;
                }
                return applicationAgreement.copy(str, agreementLink);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final AgreementLink getLink() {
                return this.link;
            }

            @k
            public final ApplicationAgreement copy(@l String title, @l AgreementLink link) {
                return new ApplicationAgreement(title, link);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ApplicationAgreement)) {
                    return false;
                }
                ApplicationAgreement applicationAgreement = (ApplicationAgreement) other;
                return L.f(this.title, applicationAgreement.title) && L.f(this.link, applicationAgreement.link);
            }

            @l
            public final AgreementLink getLink() {
                return this.link;
            }

            @l
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                AgreementLink agreementLink = this.link;
                return iHashCode + (agreementLink != null ? agreementLink.hashCode() : 0);
            }

            @k
            public String toString() {
                return "ApplicationAgreement(title=" + this.title + ", link=" + this.link + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                AgreementLink agreementLink = this.link;
                if (agreementLink == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    agreementLink.writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: LeasingCalculator.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationField;", "Landroid/os/Parcelable;", "", "title", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/LeasingCalculator$LeasingApplication$ApplicationField;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getValue", "setValue", "(Ljava/lang/String;)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ApplicationField implements Parcelable {

            @k
            public static final Parcelable.Creator<ApplicationField> CREATOR = new Creator();

            @c("title")
            @l
            private final String title;

            @c("value")
            @l
            private String value;

            /* compiled from: LeasingCalculator.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ApplicationField> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ApplicationField createFromParcel(@k Parcel parcel) {
                    return new ApplicationField(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ApplicationField[] newArray(int i12) {
                    return new ApplicationField[i12];
                }
            }

            public ApplicationField(@l String str, @l String str2) {
                this.title = str;
                this.value = str2;
            }

            public static /* synthetic */ ApplicationField copy$default(ApplicationField applicationField, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = applicationField.title;
                }
                if ((i12 & 2) != 0) {
                    str2 = applicationField.value;
                }
                return applicationField.copy(str, str2);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            @k
            public final ApplicationField copy(@l String title, @l String value) {
                return new ApplicationField(title, value);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ApplicationField)) {
                    return false;
                }
                ApplicationField applicationField = (ApplicationField) other;
                return L.f(this.title, applicationField.title) && L.f(this.value, applicationField.value);
            }

            @l
            public final String getTitle() {
                return this.title;
            }

            @l
            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.value;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final void setValue(@l String str) {
                this.value = str;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ApplicationField(title=");
                sb2.append(this.title);
                sb2.append(", value=");
                return C22026a.c(sb2, this.value, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.value);
            }
        }

        /* compiled from: LeasingCalculator.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LeasingApplication> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LeasingApplication createFromParcel(@k Parcel parcel) {
                return new LeasingApplication(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ApplicationField.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ApplicationField.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? ApplicationAgreement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LeasingApplication[] newArray(int i12) {
                return new LeasingApplication[i12];
            }
        }

        public LeasingApplication(@l String str, @l String str2, @l ApplicationField applicationField, @l ApplicationField applicationField2, @l String str3, @l ApplicationAgreement applicationAgreement) {
            this.title = str;
            this.description = str2;
            this.inn = applicationField;
            this.phone = applicationField2;
            this.sendButtonText = str3;
            this.agreement = applicationAgreement;
        }

        public static /* synthetic */ LeasingApplication copy$default(LeasingApplication leasingApplication, String str, String str2, ApplicationField applicationField, ApplicationField applicationField2, String str3, ApplicationAgreement applicationAgreement, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = leasingApplication.title;
            }
            if ((i12 & 2) != 0) {
                str2 = leasingApplication.description;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                applicationField = leasingApplication.inn;
            }
            ApplicationField applicationField3 = applicationField;
            if ((i12 & 8) != 0) {
                applicationField2 = leasingApplication.phone;
            }
            ApplicationField applicationField4 = applicationField2;
            if ((i12 & 16) != 0) {
                str3 = leasingApplication.sendButtonText;
            }
            String str5 = str3;
            if ((i12 & 32) != 0) {
                applicationAgreement = leasingApplication.agreement;
            }
            return leasingApplication.copy(str, str4, applicationField3, applicationField4, str5, applicationAgreement);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final ApplicationField getInn() {
            return this.inn;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final ApplicationField getPhone() {
            return this.phone;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getSendButtonText() {
            return this.sendButtonText;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final ApplicationAgreement getAgreement() {
            return this.agreement;
        }

        @k
        public final LeasingApplication copy(@l String title, @l String description, @l ApplicationField inn, @l ApplicationField phone, @l String sendButtonText, @l ApplicationAgreement agreement) {
            return new LeasingApplication(title, description, inn, phone, sendButtonText, agreement);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeasingApplication)) {
                return false;
            }
            LeasingApplication leasingApplication = (LeasingApplication) other;
            return L.f(this.title, leasingApplication.title) && L.f(this.description, leasingApplication.description) && L.f(this.inn, leasingApplication.inn) && L.f(this.phone, leasingApplication.phone) && L.f(this.sendButtonText, leasingApplication.sendButtonText) && L.f(this.agreement, leasingApplication.agreement);
        }

        @l
        public final ApplicationAgreement getAgreement() {
            return this.agreement;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final ApplicationField getInn() {
            return this.inn;
        }

        @l
        public final ApplicationField getPhone() {
            return this.phone;
        }

        @l
        public final String getSendButtonText() {
            return this.sendButtonText;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.description;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ApplicationField applicationField = this.inn;
            int iHashCode3 = (iHashCode2 + (applicationField == null ? 0 : applicationField.hashCode())) * 31;
            ApplicationField applicationField2 = this.phone;
            int iHashCode4 = (iHashCode3 + (applicationField2 == null ? 0 : applicationField2.hashCode())) * 31;
            String str3 = this.sendButtonText;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ApplicationAgreement applicationAgreement = this.agreement;
            return iHashCode5 + (applicationAgreement != null ? applicationAgreement.hashCode() : 0);
        }

        @k
        public String toString() {
            return "LeasingApplication(title=" + this.title + ", description=" + this.description + ", inn=" + this.inn + ", phone=" + this.phone + ", sendButtonText=" + this.sendButtonText + ", agreement=" + this.agreement + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            ApplicationField applicationField = this.inn;
            if (applicationField == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                applicationField.writeToParcel(parcel, flags);
            }
            ApplicationField applicationField2 = this.phone;
            if (applicationField2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                applicationField2.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.sendButtonText);
            ApplicationAgreement applicationAgreement = this.agreement;
            if (applicationAgreement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                applicationAgreement.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: LeasingCalculator.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/LeasingCalculator$LeasingBenefit;", "Landroid/os/Parcelable;", "", "value", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/LeasingCalculator$LeasingBenefit;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LeasingBenefit implements Parcelable {

        @k
        public static final Parcelable.Creator<LeasingBenefit> CREATOR = new Creator();

        @c("value")
        @k
        private final String value;

        /* compiled from: LeasingCalculator.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LeasingBenefit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LeasingBenefit createFromParcel(@k Parcel parcel) {
                return new LeasingBenefit(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LeasingBenefit[] newArray(int i12) {
                return new LeasingBenefit[i12];
            }
        }

        public LeasingBenefit(@k String str) {
            this.value = str;
        }

        public static /* synthetic */ LeasingBenefit copy$default(LeasingBenefit leasingBenefit, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = leasingBenefit.value;
            }
            return leasingBenefit.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @k
        public final LeasingBenefit copy(@k String value) {
            return new LeasingBenefit(value);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LeasingBenefit) && L.f(this.value, ((LeasingBenefit) other).value);
        }

        @k
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("LeasingBenefit(value="), this.value, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.value);
        }
    }

    /* compiled from: LeasingCalculator.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo$InfoModal;", "modal", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo$InfoModal;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo$InfoModal;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo$InfoModal;)Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo$InfoModal;", "getModal", "InfoModal", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class LeasingInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<LeasingInfo> CREATOR = new Creator();

        @c("modal")
        @l
        private final InfoModal modal;

        @c("title")
        @l
        private final String title;

        /* compiled from: LeasingCalculator.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LeasingInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LeasingInfo createFromParcel(@k Parcel parcel) {
                return new LeasingInfo(parcel.readString(), parcel.readInt() == 0 ? null : InfoModal.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LeasingInfo[] newArray(int i12) {
                return new LeasingInfo[i12];
            }
        }

        /* compiled from: LeasingCalculator.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ:\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b%\u0010\r¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo$InfoModal;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo$InfoModal$ModalBlock;", "blocks", "", "closeButton", "toApplicationButton", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo$InfoModal;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getBlocks", "Ljava/lang/String;", "getCloseButton", "getToApplicationButton", "ModalBlock", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class InfoModal implements Parcelable {

            @k
            public static final Parcelable.Creator<InfoModal> CREATOR = new Creator();

            @c("blocks")
            @l
            private final List<ModalBlock> blocks;

            @c("closeButton")
            @l
            private final String closeButton;

            @c("toApplicationButton")
            @l
            private final String toApplicationButton;

            /* compiled from: LeasingCalculator.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<InfoModal> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final InfoModal createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i12);
                        int iC2 = 0;
                        while (iC2 != i12) {
                            iC2 = a.c(ModalBlock.CREATOR, parcel, arrayList2, iC2, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new InfoModal(arrayList, parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final InfoModal[] newArray(int i12) {
                    return new InfoModal[i12];
                }
            }

            /* compiled from: LeasingCalculator.kt */
            @d
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo$InfoModal$ModalBlock;", "Landroid/os/Parcelable;", "", "title", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/LeasingCalculator$LeasingInfo$InfoModal$ModalBlock;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class ModalBlock implements Parcelable {

                @k
                public static final Parcelable.Creator<ModalBlock> CREATOR = new Creator();

                @c("title")
                @l
                private final String title;

                @c("value")
                @l
                private final String value;

                /* compiled from: LeasingCalculator.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ModalBlock> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ModalBlock createFromParcel(@k Parcel parcel) {
                        return new ModalBlock(parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ModalBlock[] newArray(int i12) {
                        return new ModalBlock[i12];
                    }
                }

                public ModalBlock(@l String str, @l String str2) {
                    this.title = str;
                    this.value = str2;
                }

                public static /* synthetic */ ModalBlock copy$default(ModalBlock modalBlock, String str, String str2, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = modalBlock.title;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = modalBlock.value;
                    }
                    return modalBlock.copy(str, str2);
                }

                @l
                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @l
                /* renamed from: component2, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                @k
                public final ModalBlock copy(@l String title, @l String value) {
                    return new ModalBlock(title, value);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ModalBlock)) {
                        return false;
                    }
                    ModalBlock modalBlock = (ModalBlock) other;
                    return L.f(this.title, modalBlock.title) && L.f(this.value, modalBlock.value);
                }

                @l
                public final String getTitle() {
                    return this.title;
                }

                @l
                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    String str = this.title;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.value;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("ModalBlock(title=");
                    sb2.append(this.title);
                    sb2.append(", value=");
                    return C22026a.c(sb2, this.value, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.title);
                    parcel.writeString(this.value);
                }
            }

            public InfoModal(@l List<ModalBlock> list, @l String str, @l String str2) {
                this.blocks = list;
                this.closeButton = str;
                this.toApplicationButton = str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InfoModal copy$default(InfoModal infoModal, List list, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    list = infoModal.blocks;
                }
                if ((i12 & 2) != 0) {
                    str = infoModal.closeButton;
                }
                if ((i12 & 4) != 0) {
                    str2 = infoModal.toApplicationButton;
                }
                return infoModal.copy(list, str, str2);
            }

            @l
            public final List<ModalBlock> component1() {
                return this.blocks;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getCloseButton() {
                return this.closeButton;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final String getToApplicationButton() {
                return this.toApplicationButton;
            }

            @k
            public final InfoModal copy(@l List<ModalBlock> blocks, @l String closeButton, @l String toApplicationButton) {
                return new InfoModal(blocks, closeButton, toApplicationButton);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InfoModal)) {
                    return false;
                }
                InfoModal infoModal = (InfoModal) other;
                return L.f(this.blocks, infoModal.blocks) && L.f(this.closeButton, infoModal.closeButton) && L.f(this.toApplicationButton, infoModal.toApplicationButton);
            }

            @l
            public final List<ModalBlock> getBlocks() {
                return this.blocks;
            }

            @l
            public final String getCloseButton() {
                return this.closeButton;
            }

            @l
            public final String getToApplicationButton() {
                return this.toApplicationButton;
            }

            public int hashCode() {
                List<ModalBlock> list = this.blocks;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                String str = this.closeButton;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.toApplicationButton;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("InfoModal(blocks=");
                sb2.append(this.blocks);
                sb2.append(", closeButton=");
                sb2.append(this.closeButton);
                sb2.append(", toApplicationButton=");
                return C22026a.c(sb2, this.toApplicationButton, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                List<ModalBlock> list = this.blocks;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        ((ModalBlock) itA.next()).writeToParcel(parcel, flags);
                    }
                }
                parcel.writeString(this.closeButton);
                parcel.writeString(this.toApplicationButton);
            }
        }

        public LeasingInfo(@l String str, @l InfoModal infoModal) {
            this.title = str;
            this.modal = infoModal;
        }

        public static /* synthetic */ LeasingInfo copy$default(LeasingInfo leasingInfo, String str, InfoModal infoModal, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = leasingInfo.title;
            }
            if ((i12 & 2) != 0) {
                infoModal = leasingInfo.modal;
            }
            return leasingInfo.copy(str, infoModal);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final InfoModal getModal() {
            return this.modal;
        }

        @k
        public final LeasingInfo copy(@l String title, @l InfoModal modal) {
            return new LeasingInfo(title, modal);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeasingInfo)) {
                return false;
            }
            LeasingInfo leasingInfo = (LeasingInfo) other;
            return L.f(this.title, leasingInfo.title) && L.f(this.modal, leasingInfo.modal);
        }

        @l
        public final InfoModal getModal() {
            return this.modal;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            InfoModal infoModal = this.modal;
            return iHashCode + (infoModal != null ? infoModal.hashCode() : 0);
        }

        @k
        public String toString() {
            return "LeasingInfo(title=" + this.title + ", modal=" + this.modal + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            InfoModal infoModal = this.modal;
            if (infoModal == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                infoModal.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: LeasingCalculator.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\r¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/LeasingCalculator$LeasingInputTerm;", "Landroid/os/Parcelable;", "", "title", "", "value", "min", "max", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/avito/android/remote/model/LeasingCalculator$LeasingInputTerm;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/lang/Long;", "getValue", "setValue", "(Ljava/lang/Long;)V", "getMin", "getMax", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LeasingInputTerm implements Parcelable {

        @k
        public static final Parcelable.Creator<LeasingInputTerm> CREATOR = new Creator();

        @c("max")
        @l
        private final Long max;

        @c("min")
        @l
        private final Long min;

        @c("title")
        @l
        private final String title;

        @c("value")
        @l
        private Long value;

        /* compiled from: LeasingCalculator.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LeasingInputTerm> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LeasingInputTerm createFromParcel(@k Parcel parcel) {
                return new LeasingInputTerm(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LeasingInputTerm[] newArray(int i12) {
                return new LeasingInputTerm[i12];
            }
        }

        public LeasingInputTerm(@l String str, @l Long l12, @l Long l13, @l Long l14) {
            this.title = str;
            this.value = l12;
            this.min = l13;
            this.max = l14;
        }

        public static /* synthetic */ LeasingInputTerm copy$default(LeasingInputTerm leasingInputTerm, String str, Long l12, Long l13, Long l14, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = leasingInputTerm.title;
            }
            if ((i12 & 2) != 0) {
                l12 = leasingInputTerm.value;
            }
            if ((i12 & 4) != 0) {
                l13 = leasingInputTerm.min;
            }
            if ((i12 & 8) != 0) {
                l14 = leasingInputTerm.max;
            }
            return leasingInputTerm.copy(str, l12, l13, l14);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Long getValue() {
            return this.value;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Long getMin() {
            return this.min;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Long getMax() {
            return this.max;
        }

        @k
        public final LeasingInputTerm copy(@l String title, @l Long value, @l Long min, @l Long max) {
            return new LeasingInputTerm(title, value, min, max);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeasingInputTerm)) {
                return false;
            }
            LeasingInputTerm leasingInputTerm = (LeasingInputTerm) other;
            return L.f(this.title, leasingInputTerm.title) && L.f(this.value, leasingInputTerm.value) && L.f(this.min, leasingInputTerm.min) && L.f(this.max, leasingInputTerm.max);
        }

        @l
        public final Long getMax() {
            return this.max;
        }

        @l
        public final Long getMin() {
            return this.min;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final Long getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l12 = this.value;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.min;
            int iHashCode3 = (iHashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Long l14 = this.max;
            return iHashCode3 + (l14 != null ? l14.hashCode() : 0);
        }

        public final void setValue(@l Long l12) {
            this.value = l12;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LeasingInputTerm(title=");
            sb2.append(this.title);
            sb2.append(", value=");
            sb2.append(this.value);
            sb2.append(", min=");
            sb2.append(this.min);
            sb2.append(", max=");
            return m.m(sb2, this.max, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            Long l12 = this.value;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            Long l13 = this.min;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l13);
            }
            Long l14 = this.max;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l14);
            }
        }
    }

    /* compiled from: LeasingCalculator.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0003*+,B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferBroker;", "broker", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferPayment;", "monthlyPayment", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferSaving;", "taxSavings", "<init>", "(Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferBroker;Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferPayment;Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferSaving;)V", "component1", "()Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferBroker;", "component2", "()Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferPayment;", "component3", "()Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferSaving;", "copy", "(Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferBroker;Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferPayment;Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferSaving;)Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferBroker;", "getBroker", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferPayment;", "getMonthlyPayment", "Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferSaving;", "getTaxSavings", "OfferBroker", "OfferPayment", "OfferSaving", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class LeasingOffer implements Parcelable {

        @k
        public static final Parcelable.Creator<LeasingOffer> CREATOR = new Creator();

        @c("broker")
        @l
        private final OfferBroker broker;

        @c("monthlyPayment")
        @l
        private final OfferPayment monthlyPayment;

        @c("taxSavings")
        @l
        private final OfferSaving taxSavings;

        /* compiled from: LeasingCalculator.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LeasingOffer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LeasingOffer createFromParcel(@k Parcel parcel) {
                return new LeasingOffer(parcel.readInt() == 0 ? null : OfferBroker.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OfferPayment.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OfferSaving.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LeasingOffer[] newArray(int i12) {
                return new LeasingOffer[i12];
            }
        }

        /* compiled from: LeasingCalculator.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferBroker;", "Landroid/os/Parcelable;", "", "code", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferBroker;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCode", "getName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OfferBroker implements Parcelable {

            @k
            public static final Parcelable.Creator<OfferBroker> CREATOR = new Creator();

            @c("code")
            @l
            private final String code;

            @c("name")
            @l
            private final String name;

            /* compiled from: LeasingCalculator.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OfferBroker> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OfferBroker createFromParcel(@k Parcel parcel) {
                    return new OfferBroker(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OfferBroker[] newArray(int i12) {
                    return new OfferBroker[i12];
                }
            }

            public OfferBroker(@l String str, @l String str2) {
                this.code = str;
                this.name = str2;
            }

            public static /* synthetic */ OfferBroker copy$default(OfferBroker offerBroker, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = offerBroker.code;
                }
                if ((i12 & 2) != 0) {
                    str2 = offerBroker.name;
                }
                return offerBroker.copy(str, str2);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @k
            public final OfferBroker copy(@l String code, @l String name) {
                return new OfferBroker(code, name);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OfferBroker)) {
                    return false;
                }
                OfferBroker offerBroker = (OfferBroker) other;
                return L.f(this.code, offerBroker.code) && L.f(this.name, offerBroker.name);
            }

            @l
            public final String getCode() {
                return this.code;
            }

            @l
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                String str = this.code;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.name;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("OfferBroker(code=");
                sb2.append(this.code);
                sb2.append(", name=");
                return C22026a.c(sb2, this.name, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.code);
                parcel.writeString(this.name);
            }
        }

        /* compiled from: LeasingCalculator.kt */
        @d
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferPayment;", "Landroid/os/Parcelable;", "", "title", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferPayment;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/lang/Long;", "getValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OfferPayment implements Parcelable {

            @k
            public static final Parcelable.Creator<OfferPayment> CREATOR = new Creator();

            @c("title")
            @l
            private final String title;

            @c("value")
            @l
            private final Long value;

            /* compiled from: LeasingCalculator.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OfferPayment> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OfferPayment createFromParcel(@k Parcel parcel) {
                    return new OfferPayment(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OfferPayment[] newArray(int i12) {
                    return new OfferPayment[i12];
                }
            }

            public OfferPayment(@l String str, @l Long l12) {
                this.title = str;
                this.value = l12;
            }

            public static /* synthetic */ OfferPayment copy$default(OfferPayment offerPayment, String str, Long l12, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = offerPayment.title;
                }
                if ((i12 & 2) != 0) {
                    l12 = offerPayment.value;
                }
                return offerPayment.copy(str, l12);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final Long getValue() {
                return this.value;
            }

            @k
            public final OfferPayment copy(@l String title, @l Long value) {
                return new OfferPayment(title, value);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OfferPayment)) {
                    return false;
                }
                OfferPayment offerPayment = (OfferPayment) other;
                return L.f(this.title, offerPayment.title) && L.f(this.value, offerPayment.value);
            }

            @l
            public final String getTitle() {
                return this.title;
            }

            @l
            public final Long getValue() {
                return this.value;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Long l12 = this.value;
                return iHashCode + (l12 != null ? l12.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("OfferPayment(title=");
                sb2.append(this.title);
                sb2.append(", value=");
                return m.m(sb2, this.value, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                Long l12 = this.value;
                if (l12 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l12);
                }
            }
        }

        /* compiled from: LeasingCalculator.kt */
        @d
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferSaving;", "Landroid/os/Parcelable;", "", "title", "", "value", TooltipAttribute.ATTRIBUTE_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/avito/android/remote/model/LeasingCalculator$LeasingOffer$OfferSaving;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/lang/Long;", "getValue", "getTooltip", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OfferSaving implements Parcelable {

            @k
            public static final Parcelable.Creator<OfferSaving> CREATOR = new Creator();

            @c("title")
            @l
            private final String title;

            @c(TooltipAttribute.ATTRIBUTE_TYPE)
            @l
            private final String tooltip;

            @c("value")
            @l
            private final Long value;

            /* compiled from: LeasingCalculator.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OfferSaving> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OfferSaving createFromParcel(@k Parcel parcel) {
                    return new OfferSaving(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OfferSaving[] newArray(int i12) {
                    return new OfferSaving[i12];
                }
            }

            public OfferSaving(@l String str, @l Long l12, @l String str2) {
                this.title = str;
                this.value = l12;
                this.tooltip = str2;
            }

            public static /* synthetic */ OfferSaving copy$default(OfferSaving offerSaving, String str, Long l12, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = offerSaving.title;
                }
                if ((i12 & 2) != 0) {
                    l12 = offerSaving.value;
                }
                if ((i12 & 4) != 0) {
                    str2 = offerSaving.tooltip;
                }
                return offerSaving.copy(str, l12, str2);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final Long getValue() {
                return this.value;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final String getTooltip() {
                return this.tooltip;
            }

            @k
            public final OfferSaving copy(@l String title, @l Long value, @l String tooltip) {
                return new OfferSaving(title, value, tooltip);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OfferSaving)) {
                    return false;
                }
                OfferSaving offerSaving = (OfferSaving) other;
                return L.f(this.title, offerSaving.title) && L.f(this.value, offerSaving.value) && L.f(this.tooltip, offerSaving.tooltip);
            }

            @l
            public final String getTitle() {
                return this.title;
            }

            @l
            public final String getTooltip() {
                return this.tooltip;
            }

            @l
            public final Long getValue() {
                return this.value;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Long l12 = this.value;
                int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
                String str2 = this.tooltip;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("OfferSaving(title=");
                sb2.append(this.title);
                sb2.append(", value=");
                sb2.append(this.value);
                sb2.append(", tooltip=");
                return C22026a.c(sb2, this.tooltip, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                Long l12 = this.value;
                if (l12 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l12);
                }
                parcel.writeString(this.tooltip);
            }
        }

        public LeasingOffer(@l OfferBroker offerBroker, @l OfferPayment offerPayment, @l OfferSaving offerSaving) {
            this.broker = offerBroker;
            this.monthlyPayment = offerPayment;
            this.taxSavings = offerSaving;
        }

        public static /* synthetic */ LeasingOffer copy$default(LeasingOffer leasingOffer, OfferBroker offerBroker, OfferPayment offerPayment, OfferSaving offerSaving, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                offerBroker = leasingOffer.broker;
            }
            if ((i12 & 2) != 0) {
                offerPayment = leasingOffer.monthlyPayment;
            }
            if ((i12 & 4) != 0) {
                offerSaving = leasingOffer.taxSavings;
            }
            return leasingOffer.copy(offerBroker, offerPayment, offerSaving);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final OfferBroker getBroker() {
            return this.broker;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final OfferPayment getMonthlyPayment() {
            return this.monthlyPayment;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final OfferSaving getTaxSavings() {
            return this.taxSavings;
        }

        @k
        public final LeasingOffer copy(@l OfferBroker broker, @l OfferPayment monthlyPayment, @l OfferSaving taxSavings) {
            return new LeasingOffer(broker, monthlyPayment, taxSavings);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeasingOffer)) {
                return false;
            }
            LeasingOffer leasingOffer = (LeasingOffer) other;
            return L.f(this.broker, leasingOffer.broker) && L.f(this.monthlyPayment, leasingOffer.monthlyPayment) && L.f(this.taxSavings, leasingOffer.taxSavings);
        }

        @l
        public final OfferBroker getBroker() {
            return this.broker;
        }

        @l
        public final OfferPayment getMonthlyPayment() {
            return this.monthlyPayment;
        }

        @l
        public final OfferSaving getTaxSavings() {
            return this.taxSavings;
        }

        public int hashCode() {
            OfferBroker offerBroker = this.broker;
            int iHashCode = (offerBroker == null ? 0 : offerBroker.hashCode()) * 31;
            OfferPayment offerPayment = this.monthlyPayment;
            int iHashCode2 = (iHashCode + (offerPayment == null ? 0 : offerPayment.hashCode())) * 31;
            OfferSaving offerSaving = this.taxSavings;
            return iHashCode2 + (offerSaving != null ? offerSaving.hashCode() : 0);
        }

        @k
        public String toString() {
            return "LeasingOffer(broker=" + this.broker + ", monthlyPayment=" + this.monthlyPayment + ", taxSavings=" + this.taxSavings + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            OfferBroker offerBroker = this.broker;
            if (offerBroker == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                offerBroker.writeToParcel(parcel, flags);
            }
            OfferPayment offerPayment = this.monthlyPayment;
            if (offerPayment == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                offerPayment.writeToParcel(parcel, flags);
            }
            OfferSaving offerSaving = this.taxSavings;
            if (offerSaving == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                offerSaving.writeToParcel(parcel, flags);
            }
        }
    }

    public LeasingCalculator(@l String str, @l LeasingInputTerm leasingInputTerm, @l LeasingInputTerm leasingInputTerm2, @l List<LeasingOffer> list, @l List<LeasingBenefit> list2, @l String str2, @l LeasingInfo leasingInfo, @l String str3, @l DeepLink deepLink, @l LeasingApplication leasingApplication) {
        this.title = str;
        this.downPayment = leasingInputTerm;
        this.period = leasingInputTerm2;
        this.offers = list;
        this.benefits = list2;
        this.applicationButtonText = str2;
        this.leasingInfo = leasingInfo;
        this.applicationLink = str3;
        this.applicationFormLink = deepLink;
        this.application = leasingApplication;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final LeasingApplication getApplication() {
        return this.application;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final LeasingInputTerm getDownPayment() {
        return this.downPayment;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final LeasingInputTerm getPeriod() {
        return this.period;
    }

    @l
    public final List<LeasingOffer> component4() {
        return this.offers;
    }

    @l
    public final List<LeasingBenefit> component5() {
        return this.benefits;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getApplicationButtonText() {
        return this.applicationButtonText;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final LeasingInfo getLeasingInfo() {
        return this.leasingInfo;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getApplicationLink() {
        return this.applicationLink;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final DeepLink getApplicationFormLink() {
        return this.applicationFormLink;
    }

    @k
    public final LeasingCalculator copy(@l String title, @l LeasingInputTerm downPayment, @l LeasingInputTerm period, @l List<LeasingOffer> offers, @l List<LeasingBenefit> benefits, @l String applicationButtonText, @l LeasingInfo leasingInfo, @l String applicationLink, @l DeepLink applicationFormLink, @l LeasingApplication application) {
        return new LeasingCalculator(title, downPayment, period, offers, benefits, applicationButtonText, leasingInfo, applicationLink, applicationFormLink, application);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeasingCalculator)) {
            return false;
        }
        LeasingCalculator leasingCalculator = (LeasingCalculator) other;
        return L.f(this.title, leasingCalculator.title) && L.f(this.downPayment, leasingCalculator.downPayment) && L.f(this.period, leasingCalculator.period) && L.f(this.offers, leasingCalculator.offers) && L.f(this.benefits, leasingCalculator.benefits) && L.f(this.applicationButtonText, leasingCalculator.applicationButtonText) && L.f(this.leasingInfo, leasingCalculator.leasingInfo) && L.f(this.applicationLink, leasingCalculator.applicationLink) && L.f(this.applicationFormLink, leasingCalculator.applicationFormLink) && L.f(this.application, leasingCalculator.application);
    }

    @l
    public final LeasingApplication getApplication() {
        return this.application;
    }

    @l
    public final String getApplicationButtonText() {
        return this.applicationButtonText;
    }

    @l
    public final DeepLink getApplicationFormLink() {
        return this.applicationFormLink;
    }

    @l
    public final String getApplicationLink() {
        return this.applicationLink;
    }

    @l
    public final List<LeasingBenefit> getBenefits() {
        return this.benefits;
    }

    @l
    public final LeasingInputTerm getDownPayment() {
        return this.downPayment;
    }

    @l
    public final LeasingInfo getLeasingInfo() {
        return this.leasingInfo;
    }

    @l
    public final List<LeasingOffer> getOffers() {
        return this.offers;
    }

    @l
    public final LeasingInputTerm getPeriod() {
        return this.period;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LeasingInputTerm leasingInputTerm = this.downPayment;
        int iHashCode2 = (iHashCode + (leasingInputTerm == null ? 0 : leasingInputTerm.hashCode())) * 31;
        LeasingInputTerm leasingInputTerm2 = this.period;
        int iHashCode3 = (iHashCode2 + (leasingInputTerm2 == null ? 0 : leasingInputTerm2.hashCode())) * 31;
        List<LeasingOffer> list = this.offers;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<LeasingBenefit> list2 = this.benefits;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.applicationButtonText;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LeasingInfo leasingInfo = this.leasingInfo;
        int iHashCode7 = (iHashCode6 + (leasingInfo == null ? 0 : leasingInfo.hashCode())) * 31;
        String str3 = this.applicationLink;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DeepLink deepLink = this.applicationFormLink;
        int iHashCode9 = (iHashCode8 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        LeasingApplication leasingApplication = this.application;
        return iHashCode9 + (leasingApplication != null ? leasingApplication.hashCode() : 0);
    }

    public final void setOffers(@l List<LeasingOffer> list) {
        this.offers = list;
    }

    @k
    public String toString() {
        return "LeasingCalculator(title=" + this.title + ", downPayment=" + this.downPayment + ", period=" + this.period + ", offers=" + this.offers + ", benefits=" + this.benefits + ", applicationButtonText=" + this.applicationButtonText + ", leasingInfo=" + this.leasingInfo + ", applicationLink=" + this.applicationLink + ", applicationFormLink=" + this.applicationFormLink + ", application=" + this.application + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        LeasingInputTerm leasingInputTerm = this.downPayment;
        if (leasingInputTerm == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            leasingInputTerm.writeToParcel(parcel, flags);
        }
        LeasingInputTerm leasingInputTerm2 = this.period;
        if (leasingInputTerm2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            leasingInputTerm2.writeToParcel(parcel, flags);
        }
        List<LeasingOffer> list = this.offers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((LeasingOffer) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<LeasingBenefit> list2 = this.benefits;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((LeasingBenefit) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.applicationButtonText);
        LeasingInfo leasingInfo = this.leasingInfo;
        if (leasingInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            leasingInfo.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.applicationLink);
        parcel.writeParcelable(this.applicationFormLink, flags);
        LeasingApplication leasingApplication = this.application;
        if (leasingApplication == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            leasingApplication.writeToParcel(parcel, flags);
        }
    }
}
