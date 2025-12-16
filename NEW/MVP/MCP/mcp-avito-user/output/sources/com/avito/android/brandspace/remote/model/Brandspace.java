package com.avito.android.brandspace.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Brandspace.kt */
@d
@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0001WBÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b,\u0010'J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b-\u0010'J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b.\u0010'J\u0012\u0010/\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b/\u00100Jî\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u001dJ\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u00020\u00072\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u000204HÖ\u0001¢\u0006\u0004\b;\u00106J \u0010@\u001a\u00020?2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u000204HÖ\u0001¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010B\u001a\u0004\bD\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bE\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bF\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010G\u001a\u0004\bH\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bI\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bJ\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bK\u0010\u001dR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010L\u001a\u0004\bM\u0010'R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010L\u001a\u0004\bN\u0010'R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bO\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\bQ\u0010+R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\bR\u0010'R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\bS\u0010'R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010L\u001a\u0004\bT\u0010'R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010U\u001a\u0004\bV\u00100¨\u0006X"}, d2 = {"Lcom/avito/android/brandspace/remote/model/Brandspace;", "Landroid/os/Parcelable;", "", "id", "title", "logoUrl", "logoUrlDark", "", "hideDefaultLogo", "topFormId", "mainFormId", "bottomFormId", "", "Lcom/avito/android/beduin_models/BeduinModel;", "topComponents", "mainComponents", "bottomComponents", "Lcom/avito/android/brandspace/remote/model/BrandspaceAdjustParameters;", "adjustParams", "Lcom/avito/android/beduin_models/BeduinAction;", "onLoadedActions", "onVisitedActions", "Lcom/avito/android/brandspace/remote/model/BrandspaceFormFailedData;", "onFormFailed", "Lcom/avito/android/brandspace/remote/model/Brandspace$BeduinV2;", "beduinV2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/brandspace/remote/model/BrandspaceAdjustParameters;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/brandspace/remote/model/Brandspace$BeduinV2;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "component8", "component9", "()Ljava/util/List;", "component10", "component11", "component12", "()Lcom/avito/android/brandspace/remote/model/BrandspaceAdjustParameters;", "component13", "component14", "component15", "component16", "()Lcom/avito/android/brandspace/remote/model/Brandspace$BeduinV2;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/brandspace/remote/model/BrandspaceAdjustParameters;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/brandspace/remote/model/Brandspace$BeduinV2;)Lcom/avito/android/brandspace/remote/model/Brandspace;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getLogoUrl", "getLogoUrlDark", "Ljava/lang/Boolean;", "getHideDefaultLogo", "getTopFormId", "getMainFormId", "getBottomFormId", "Ljava/util/List;", "getTopComponents", "getMainComponents", "getBottomComponents", "Lcom/avito/android/brandspace/remote/model/BrandspaceAdjustParameters;", "getAdjustParams", "getOnLoadedActions", "getOnVisitedActions", "getOnFormFailed", "Lcom/avito/android/brandspace/remote/model/Brandspace$BeduinV2;", "getBeduinV2", "BeduinV2", "_avito-discouraged_avito-api_brandspace"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Brandspace implements Parcelable {

    @k
    public static final Parcelable.Creator<Brandspace> CREATOR = new a();

    @l
    private final BrandspaceAdjustParameters adjustParams;

    @l
    private final BeduinV2 beduinV2;

    @l
    private final List<BeduinModel> bottomComponents;

    @l
    private final String bottomFormId;

    @l
    private final Boolean hideDefaultLogo;

    @k
    private final String id;

    @l
    private final String logoUrl;

    @l
    private final String logoUrlDark;

    @k
    private final List<BeduinModel> mainComponents;

    @l
    private final String mainFormId;

    @l
    private final List<BrandspaceFormFailedData> onFormFailed;

    @l
    private final List<BeduinAction> onLoadedActions;

    @l
    private final List<BeduinAction> onVisitedActions;

    @k
    private final String title;

    @l
    private final List<BeduinModel> topComponents;

    @l
    private final String topFormId;

    /* compiled from: Brandspace.kt */
    @Keep
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ:\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/brandspace/remote/model/Brandspace$BeduinV2;", "Landroid/os/Parcelable;", "", "", "onLoadedDeeplinks", "onVisitedDeeplinks", "beduinData", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/brandspace/remote/model/Brandspace$BeduinV2;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getOnLoadedDeeplinks", "getOnVisitedDeeplinks", "Ljava/lang/String;", "getBeduinData", "_avito-discouraged_avito-api_brandspace"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class BeduinV2 implements Parcelable {

        @k
        public static final Parcelable.Creator<BeduinV2> CREATOR = new a();

        @k
        private final String beduinData;

        @k
        private final List<String> onLoadedDeeplinks;

        @k
        private final List<String> onVisitedDeeplinks;

        /* compiled from: Brandspace.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BeduinV2> {
            @Override // android.os.Parcelable.Creator
            public final BeduinV2 createFromParcel(Parcel parcel) {
                return new BeduinV2(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BeduinV2[] newArray(int i12) {
                return new BeduinV2[i12];
            }
        }

        public BeduinV2(@k List<String> list, @k List<String> list2, @k String str) {
            this.onLoadedDeeplinks = list;
            this.onVisitedDeeplinks = list2;
            this.beduinData = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BeduinV2 copy$default(BeduinV2 beduinV2, List list, List list2, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = beduinV2.onLoadedDeeplinks;
            }
            if ((i12 & 2) != 0) {
                list2 = beduinV2.onVisitedDeeplinks;
            }
            if ((i12 & 4) != 0) {
                str = beduinV2.beduinData;
            }
            return beduinV2.copy(list, list2, str);
        }

        @k
        public final List<String> component1() {
            return this.onLoadedDeeplinks;
        }

        @k
        public final List<String> component2() {
            return this.onVisitedDeeplinks;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getBeduinData() {
            return this.beduinData;
        }

        @k
        public final BeduinV2 copy(@k List<String> onLoadedDeeplinks, @k List<String> onVisitedDeeplinks, @k String beduinData) {
            return new BeduinV2(onLoadedDeeplinks, onVisitedDeeplinks, beduinData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BeduinV2)) {
                return false;
            }
            BeduinV2 beduinV2 = (BeduinV2) other;
            return L.f(this.onLoadedDeeplinks, beduinV2.onLoadedDeeplinks) && L.f(this.onVisitedDeeplinks, beduinV2.onVisitedDeeplinks) && L.f(this.beduinData, beduinV2.beduinData);
        }

        @k
        public final String getBeduinData() {
            return this.beduinData;
        }

        @k
        public final List<String> getOnLoadedDeeplinks() {
            return this.onLoadedDeeplinks;
        }

        @k
        public final List<String> getOnVisitedDeeplinks() {
            return this.onVisitedDeeplinks;
        }

        public int hashCode() {
            return this.beduinData.hashCode() + H.e(this.onLoadedDeeplinks.hashCode() * 31, 31, this.onVisitedDeeplinks);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("BeduinV2(onLoadedDeeplinks=");
            sb2.append(this.onLoadedDeeplinks);
            sb2.append(", onVisitedDeeplinks=");
            sb2.append(this.onVisitedDeeplinks);
            sb2.append(", beduinData=");
            return C22026a.c(sb2, this.beduinData, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeStringList(this.onLoadedDeeplinks);
            parcel.writeStringList(this.onVisitedDeeplinks);
            parcel.writeString(this.beduinData);
        }
    }

    /* compiled from: Brandspace.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Brandspace> {
        @Override // android.os.Parcelable.Creator
        public final Brandspace createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            BrandspaceAdjustParameters brandspaceAdjustParameters;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Brandspace.class, parcel, arrayList, iL2, 1);
                }
            }
            int i13 = parcel.readInt();
            ArrayList arrayList8 = new ArrayList(i13);
            int iL3 = 0;
            while (iL3 != i13) {
                iL3 = com.avito.android.actions_sheet.a.l(Brandspace.class, parcel, arrayList8, iL3, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList2 = new ArrayList(i14);
                int iL4 = 0;
                while (iL4 != i14) {
                    iL4 = com.avito.android.actions_sheet.a.l(Brandspace.class, parcel, arrayList2, iL4, 1);
                }
            }
            BrandspaceAdjustParameters brandspaceAdjustParametersCreateFromParcel = parcel.readInt() == 0 ? null : BrandspaceAdjustParameters.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                brandspaceAdjustParameters = brandspaceAdjustParametersCreateFromParcel;
                arrayList3 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i15);
                brandspaceAdjustParameters = brandspaceAdjustParametersCreateFromParcel;
                int iL5 = 0;
                while (iL5 != i15) {
                    iL5 = com.avito.android.actions_sheet.a.l(Brandspace.class, parcel, arrayList9, iL5, 1);
                    i15 = i15;
                }
                arrayList3 = arrayList9;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = arrayList3;
                arrayList5 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i16);
                arrayList4 = arrayList3;
                int iL6 = 0;
                while (iL6 != i16) {
                    iL6 = com.avito.android.actions_sheet.a.l(Brandspace.class, parcel, arrayList10, iL6, 1);
                    i16 = i16;
                }
                arrayList5 = arrayList10;
            }
            if (parcel.readInt() == 0) {
                arrayList6 = arrayList5;
                arrayList7 = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(i17);
                int iC2 = 0;
                while (iC2 != i17) {
                    iC2 = com.avito.android.actions_sheet.a.c(BrandspaceFormFailedData.CREATOR, parcel, arrayList11, iC2, 1);
                    i17 = i17;
                    arrayList5 = arrayList5;
                }
                arrayList6 = arrayList5;
                arrayList7 = arrayList11;
            }
            return new Brandspace(string, string2, string3, string4, boolValueOf, string5, string6, string7, arrayList, arrayList8, arrayList2, brandspaceAdjustParameters, arrayList4, arrayList6, arrayList7, parcel.readInt() == 0 ? null : BeduinV2.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Brandspace[] newArray(int i12) {
            return new Brandspace[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Brandspace(@k String str, @k String str2, @l String str3, @l String str4, @l Boolean bool, @l String str5, @l String str6, @l String str7, @l List<? extends BeduinModel> list, @k List<? extends BeduinModel> list2, @l List<? extends BeduinModel> list3, @l BrandspaceAdjustParameters brandspaceAdjustParameters, @l List<? extends BeduinAction> list4, @l List<? extends BeduinAction> list5, @l List<BrandspaceFormFailedData> list6, @l BeduinV2 beduinV2) {
        this.id = str;
        this.title = str2;
        this.logoUrl = str3;
        this.logoUrlDark = str4;
        this.hideDefaultLogo = bool;
        this.topFormId = str5;
        this.mainFormId = str6;
        this.bottomFormId = str7;
        this.topComponents = list;
        this.mainComponents = list2;
        this.bottomComponents = list3;
        this.adjustParams = brandspaceAdjustParameters;
        this.onLoadedActions = list4;
        this.onVisitedActions = list5;
        this.onFormFailed = list6;
        this.beduinV2 = beduinV2;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    public final List<BeduinModel> component10() {
        return this.mainComponents;
    }

    @l
    public final List<BeduinModel> component11() {
        return this.bottomComponents;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final BrandspaceAdjustParameters getAdjustParams() {
        return this.adjustParams;
    }

    @l
    public final List<BeduinAction> component13() {
        return this.onLoadedActions;
    }

    @l
    public final List<BeduinAction> component14() {
        return this.onVisitedActions;
    }

    @l
    public final List<BrandspaceFormFailedData> component15() {
        return this.onFormFailed;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final BeduinV2 getBeduinV2() {
        return this.beduinV2;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getLogoUrlDark() {
        return this.logoUrlDark;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getHideDefaultLogo() {
        return this.hideDefaultLogo;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getTopFormId() {
        return this.topFormId;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getMainFormId() {
        return this.mainFormId;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getBottomFormId() {
        return this.bottomFormId;
    }

    @l
    public final List<BeduinModel> component9() {
        return this.topComponents;
    }

    @k
    public final Brandspace copy(@k String id2, @k String title, @l String logoUrl, @l String logoUrlDark, @l Boolean hideDefaultLogo, @l String topFormId, @l String mainFormId, @l String bottomFormId, @l List<? extends BeduinModel> topComponents, @k List<? extends BeduinModel> mainComponents, @l List<? extends BeduinModel> bottomComponents, @l BrandspaceAdjustParameters adjustParams, @l List<? extends BeduinAction> onLoadedActions, @l List<? extends BeduinAction> onVisitedActions, @l List<BrandspaceFormFailedData> onFormFailed, @l BeduinV2 beduinV2) {
        return new Brandspace(id2, title, logoUrl, logoUrlDark, hideDefaultLogo, topFormId, mainFormId, bottomFormId, topComponents, mainComponents, bottomComponents, adjustParams, onLoadedActions, onVisitedActions, onFormFailed, beduinV2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Brandspace)) {
            return false;
        }
        Brandspace brandspace = (Brandspace) other;
        return L.f(this.id, brandspace.id) && L.f(this.title, brandspace.title) && L.f(this.logoUrl, brandspace.logoUrl) && L.f(this.logoUrlDark, brandspace.logoUrlDark) && L.f(this.hideDefaultLogo, brandspace.hideDefaultLogo) && L.f(this.topFormId, brandspace.topFormId) && L.f(this.mainFormId, brandspace.mainFormId) && L.f(this.bottomFormId, brandspace.bottomFormId) && L.f(this.topComponents, brandspace.topComponents) && L.f(this.mainComponents, brandspace.mainComponents) && L.f(this.bottomComponents, brandspace.bottomComponents) && L.f(this.adjustParams, brandspace.adjustParams) && L.f(this.onLoadedActions, brandspace.onLoadedActions) && L.f(this.onVisitedActions, brandspace.onVisitedActions) && L.f(this.onFormFailed, brandspace.onFormFailed) && L.f(this.beduinV2, brandspace.beduinV2);
    }

    @l
    public final BrandspaceAdjustParameters getAdjustParams() {
        return this.adjustParams;
    }

    @l
    public final BeduinV2 getBeduinV2() {
        return this.beduinV2;
    }

    @l
    public final List<BeduinModel> getBottomComponents() {
        return this.bottomComponents;
    }

    @l
    public final String getBottomFormId() {
        return this.bottomFormId;
    }

    @l
    public final Boolean getHideDefaultLogo() {
        return this.hideDefaultLogo;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @l
    public final String getLogoUrlDark() {
        return this.logoUrlDark;
    }

    @k
    public final List<BeduinModel> getMainComponents() {
        return this.mainComponents;
    }

    @l
    public final String getMainFormId() {
        return this.mainFormId;
    }

    @l
    public final List<BrandspaceFormFailedData> getOnFormFailed() {
        return this.onFormFailed;
    }

    @l
    public final List<BeduinAction> getOnLoadedActions() {
        return this.onLoadedActions;
    }

    @l
    public final List<BeduinAction> getOnVisitedActions() {
        return this.onVisitedActions;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<BeduinModel> getTopComponents() {
        return this.topComponents;
    }

    @l
    public final String getTopFormId() {
        return this.topFormId;
    }

    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        String str = this.logoUrl;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logoUrlDark;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hideDefaultLogo;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.topFormId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mainFormId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bottomFormId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<BeduinModel> list = this.topComponents;
        int iE2 = H.e((iHashCode6 + (list == null ? 0 : list.hashCode())) * 31, 31, this.mainComponents);
        List<BeduinModel> list2 = this.bottomComponents;
        int iHashCode7 = (iE2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BrandspaceAdjustParameters brandspaceAdjustParameters = this.adjustParams;
        int iHashCode8 = (iHashCode7 + (brandspaceAdjustParameters == null ? 0 : brandspaceAdjustParameters.hashCode())) * 31;
        List<BeduinAction> list3 = this.onLoadedActions;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BeduinAction> list4 = this.onVisitedActions;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<BrandspaceFormFailedData> list5 = this.onFormFailed;
        int iHashCode11 = (iHashCode10 + (list5 == null ? 0 : list5.hashCode())) * 31;
        BeduinV2 beduinV2 = this.beduinV2;
        return iHashCode11 + (beduinV2 != null ? beduinV2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Brandspace(id=" + this.id + ", title=" + this.title + ", logoUrl=" + this.logoUrl + ", logoUrlDark=" + this.logoUrlDark + ", hideDefaultLogo=" + this.hideDefaultLogo + ", topFormId=" + this.topFormId + ", mainFormId=" + this.mainFormId + ", bottomFormId=" + this.bottomFormId + ", topComponents=" + this.topComponents + ", mainComponents=" + this.mainComponents + ", bottomComponents=" + this.bottomComponents + ", adjustParams=" + this.adjustParams + ", onLoadedActions=" + this.onLoadedActions + ", onVisitedActions=" + this.onVisitedActions + ", onFormFailed=" + this.onFormFailed + ", beduinV2=" + this.beduinV2 + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.logoUrl);
        parcel.writeString(this.logoUrlDark);
        Boolean bool = this.hideDefaultLogo;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.topFormId);
        parcel.writeString(this.mainFormId);
        parcel.writeString(this.bottomFormId);
        List<BeduinModel> list = this.topComponents;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Iterator itJ = C0.j(this.mainComponents, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        List<BeduinModel> list2 = this.bottomComponents;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        BrandspaceAdjustParameters brandspaceAdjustParameters = this.adjustParams;
        if (brandspaceAdjustParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            brandspaceAdjustParameters.writeToParcel(parcel, flags);
        }
        List<BeduinAction> list3 = this.onLoadedActions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        List<BeduinAction> list4 = this.onVisitedActions;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA4 = com.avito.android.actions_sheet.a.A(list4, parcel, 1);
            while (itA4.hasNext()) {
                parcel.writeParcelable((Parcelable) itA4.next(), flags);
            }
        }
        List<BrandspaceFormFailedData> list5 = this.onFormFailed;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA5 = com.avito.android.actions_sheet.a.A(list5, parcel, 1);
            while (itA5.hasNext()) {
                ((BrandspaceFormFailedData) itA5.next()).writeToParcel(parcel, flags);
            }
        }
        BeduinV2 beduinV2 = this.beduinV2;
        if (beduinV2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinV2.writeToParcel(parcel, flags);
        }
    }
}
