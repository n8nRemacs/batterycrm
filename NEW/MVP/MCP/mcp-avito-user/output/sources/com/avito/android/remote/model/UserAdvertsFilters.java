package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsFiltersResult.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\u0006HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\u0006HÆ\u0003¢\u0006\u0004\b*\u0010 JÄ\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0006HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010\u001eJ\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020.HÖ\u0001¢\u0006\u0004\b5\u00100J \u0010:\u001a\u0002092\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020.HÖ\u0001¢\u0006\u0004\b:\u0010;J)\u0010>\u001a\u00020\u00152\b\u0010<\u001a\u0004\u0018\u00010\u00042\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006H\u0002¢\u0006\u0004\b>\u0010?R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bC\u0010\u001eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bE\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bF\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bG\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bH\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bI\u0010\u001eR\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bJ\u0010\u001eR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bK\u0010 R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bL\u0010 R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bM\u0010 R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bN\u0010 R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bO\u0010 ¨\u0006P"}, d2 = {"Lcom/avito/android/remote/model/UserAdvertsFilters;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UserAdvertsFiltersNavigation;", "navigationBar", "", "screenName", "", "innerScreenNames", "topFormId", "defaultTopFormId", "mainFormId", "defaultMainFormId", "bottomFormId", "Lcom/avito/android/beduin_models/BeduinModel;", "topComponents", "defaultTopComponents", "mainComponents", "defaultMainComponents", "bottomComponents", "<init>", "(Lcom/avito/android/remote/model/UserAdvertsFiltersNavigation;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "topDefaultFormIsPresent", "()Z", "mainDefaultFormIsPresent", "topFormChanged", "mainFormChanged", "component1", "()Lcom/avito/android/remote/model/UserAdvertsFiltersNavigation;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lcom/avito/android/remote/model/UserAdvertsFiltersNavigation;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/UserAdvertsFilters;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "formId", "formComponents", "defaultFormIsPresent", "(Ljava/lang/String;Ljava/util/List;)Z", "Lcom/avito/android/remote/model/UserAdvertsFiltersNavigation;", "getNavigationBar", "Ljava/lang/String;", "getScreenName", "Ljava/util/List;", "getInnerScreenNames", "getTopFormId", "getDefaultTopFormId", "getMainFormId", "getDefaultMainFormId", "getBottomFormId", "getTopComponents", "getDefaultTopComponents", "getMainComponents", "getDefaultMainComponents", "getBottomComponents", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UserAdvertsFilters implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsFilters> CREATOR = new Creator();

    @c("bottomComponents")
    @k
    private final List<BeduinModel> bottomComponents;

    @c("bottomFormId")
    @k
    private final String bottomFormId;

    @c("defaultMainComponents")
    @l
    private final List<BeduinModel> defaultMainComponents;

    @c("defaultMainFormId")
    @l
    private final String defaultMainFormId;

    @c("defaultTopComponents")
    @l
    private final List<BeduinModel> defaultTopComponents;

    @c("defaultTopFormId")
    @l
    private final String defaultTopFormId;

    @c("innerScreenNames")
    @l
    private final List<String> innerScreenNames;

    @c("mainComponents")
    @k
    private final List<BeduinModel> mainComponents;

    @c("mainFormId")
    @k
    private final String mainFormId;

    @c("filtersNavBar")
    @k
    private final UserAdvertsFiltersNavigation navigationBar;

    @c("screenName")
    @k
    private final String screenName;

    @c("topComponents")
    @l
    private final List<BeduinModel> topComponents;

    @c("topFormId")
    @l
    private final String topFormId;

    /* compiled from: UserAdvertsFiltersResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserAdvertsFilters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserAdvertsFilters createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            UserAdvertsFiltersNavigation userAdvertsFiltersNavigationCreateFromParcel = UserAdvertsFiltersNavigation.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(UserAdvertsFilters.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = a.l(UserAdvertsFilters.class, parcel, arrayList2, iL3, 1);
                }
            }
            int i14 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i14);
            int iL4 = 0;
            while (iL4 != i14) {
                iL4 = a.l(UserAdvertsFilters.class, parcel, arrayList4, iL4, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i15);
                int iL5 = 0;
                while (iL5 != i15) {
                    iL5 = a.l(UserAdvertsFilters.class, parcel, arrayList5, iL5, 1);
                    i15 = i15;
                }
                arrayList3 = arrayList5;
            }
            int i16 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i16);
            int iL6 = 0;
            while (iL6 != i16) {
                iL6 = a.l(UserAdvertsFilters.class, parcel, arrayList6, iL6, 1);
                i16 = i16;
            }
            return new UserAdvertsFilters(userAdvertsFiltersNavigationCreateFromParcel, string, arrayListCreateStringArrayList, string2, string3, string4, string5, string6, arrayList, arrayList2, arrayList4, arrayList3, arrayList6);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserAdvertsFilters[] newArray(int i12) {
            return new UserAdvertsFilters[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserAdvertsFilters(@k UserAdvertsFiltersNavigation userAdvertsFiltersNavigation, @k String str, @l List<String> list, @l String str2, @l String str3, @k String str4, @l String str5, @k String str6, @l List<? extends BeduinModel> list2, @l List<? extends BeduinModel> list3, @k List<? extends BeduinModel> list4, @l List<? extends BeduinModel> list5, @k List<? extends BeduinModel> list6) {
        this.navigationBar = userAdvertsFiltersNavigation;
        this.screenName = str;
        this.innerScreenNames = list;
        this.topFormId = str2;
        this.defaultTopFormId = str3;
        this.mainFormId = str4;
        this.defaultMainFormId = str5;
        this.bottomFormId = str6;
        this.topComponents = list2;
        this.defaultTopComponents = list3;
        this.mainComponents = list4;
        this.defaultMainComponents = list5;
        this.bottomComponents = list6;
    }

    private final boolean defaultFormIsPresent(String formId, List<? extends BeduinModel> formComponents) {
        List<? extends BeduinModel> list;
        return (formId == null || (list = formComponents) == null || list.isEmpty()) ? false : true;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final UserAdvertsFiltersNavigation getNavigationBar() {
        return this.navigationBar;
    }

    @l
    public final List<BeduinModel> component10() {
        return this.defaultTopComponents;
    }

    @k
    public final List<BeduinModel> component11() {
        return this.mainComponents;
    }

    @l
    public final List<BeduinModel> component12() {
        return this.defaultMainComponents;
    }

    @k
    public final List<BeduinModel> component13() {
        return this.bottomComponents;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    @l
    public final List<String> component3() {
        return this.innerScreenNames;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getTopFormId() {
        return this.topFormId;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getDefaultTopFormId() {
        return this.defaultTopFormId;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getMainFormId() {
        return this.mainFormId;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getDefaultMainFormId() {
        return this.defaultMainFormId;
    }

    @k
    /* renamed from: component8, reason: from getter */
    public final String getBottomFormId() {
        return this.bottomFormId;
    }

    @l
    public final List<BeduinModel> component9() {
        return this.topComponents;
    }

    @k
    public final UserAdvertsFilters copy(@k UserAdvertsFiltersNavigation navigationBar, @k String screenName, @l List<String> innerScreenNames, @l String topFormId, @l String defaultTopFormId, @k String mainFormId, @l String defaultMainFormId, @k String bottomFormId, @l List<? extends BeduinModel> topComponents, @l List<? extends BeduinModel> defaultTopComponents, @k List<? extends BeduinModel> mainComponents, @l List<? extends BeduinModel> defaultMainComponents, @k List<? extends BeduinModel> bottomComponents) {
        return new UserAdvertsFilters(navigationBar, screenName, innerScreenNames, topFormId, defaultTopFormId, mainFormId, defaultMainFormId, bottomFormId, topComponents, defaultTopComponents, mainComponents, defaultMainComponents, bottomComponents);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAdvertsFilters)) {
            return false;
        }
        UserAdvertsFilters userAdvertsFilters = (UserAdvertsFilters) other;
        return L.f(this.navigationBar, userAdvertsFilters.navigationBar) && L.f(this.screenName, userAdvertsFilters.screenName) && L.f(this.innerScreenNames, userAdvertsFilters.innerScreenNames) && L.f(this.topFormId, userAdvertsFilters.topFormId) && L.f(this.defaultTopFormId, userAdvertsFilters.defaultTopFormId) && L.f(this.mainFormId, userAdvertsFilters.mainFormId) && L.f(this.defaultMainFormId, userAdvertsFilters.defaultMainFormId) && L.f(this.bottomFormId, userAdvertsFilters.bottomFormId) && L.f(this.topComponents, userAdvertsFilters.topComponents) && L.f(this.defaultTopComponents, userAdvertsFilters.defaultTopComponents) && L.f(this.mainComponents, userAdvertsFilters.mainComponents) && L.f(this.defaultMainComponents, userAdvertsFilters.defaultMainComponents) && L.f(this.bottomComponents, userAdvertsFilters.bottomComponents);
    }

    @k
    public final List<BeduinModel> getBottomComponents() {
        return this.bottomComponents;
    }

    @k
    public final String getBottomFormId() {
        return this.bottomFormId;
    }

    @l
    public final List<BeduinModel> getDefaultMainComponents() {
        return this.defaultMainComponents;
    }

    @l
    public final String getDefaultMainFormId() {
        return this.defaultMainFormId;
    }

    @l
    public final List<BeduinModel> getDefaultTopComponents() {
        return this.defaultTopComponents;
    }

    @l
    public final String getDefaultTopFormId() {
        return this.defaultTopFormId;
    }

    @l
    public final List<String> getInnerScreenNames() {
        return this.innerScreenNames;
    }

    @k
    public final List<BeduinModel> getMainComponents() {
        return this.mainComponents;
    }

    @k
    public final String getMainFormId() {
        return this.mainFormId;
    }

    @k
    public final UserAdvertsFiltersNavigation getNavigationBar() {
        return this.navigationBar;
    }

    @k
    public final String getScreenName() {
        return this.screenName;
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
        int iD2 = H.d(this.navigationBar.hashCode() * 31, 31, this.screenName);
        List<String> list = this.innerScreenNames;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.topFormId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.defaultTopFormId;
        int iD3 = H.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.mainFormId);
        String str3 = this.defaultMainFormId;
        int iD4 = H.d((iD3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.bottomFormId);
        List<BeduinModel> list2 = this.topComponents;
        int iHashCode3 = (iD4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BeduinModel> list3 = this.defaultTopComponents;
        int iE2 = H.e((iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.mainComponents);
        List<BeduinModel> list4 = this.defaultMainComponents;
        return this.bottomComponents.hashCode() + ((iE2 + (list4 != null ? list4.hashCode() : 0)) * 31);
    }

    public final boolean mainDefaultFormIsPresent() {
        return defaultFormIsPresent(this.defaultMainFormId, this.defaultMainComponents);
    }

    public final boolean mainFormChanged() {
        return !L.f(this.defaultMainComponents, this.mainComponents);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertsFilters(navigationBar=");
        sb2.append(this.navigationBar);
        sb2.append(", screenName=");
        sb2.append(this.screenName);
        sb2.append(", innerScreenNames=");
        sb2.append(this.innerScreenNames);
        sb2.append(", topFormId=");
        sb2.append(this.topFormId);
        sb2.append(", defaultTopFormId=");
        sb2.append(this.defaultTopFormId);
        sb2.append(", mainFormId=");
        sb2.append(this.mainFormId);
        sb2.append(", defaultMainFormId=");
        sb2.append(this.defaultMainFormId);
        sb2.append(", bottomFormId=");
        sb2.append(this.bottomFormId);
        sb2.append(", topComponents=");
        sb2.append(this.topComponents);
        sb2.append(", defaultTopComponents=");
        sb2.append(this.defaultTopComponents);
        sb2.append(", mainComponents=");
        sb2.append(this.mainComponents);
        sb2.append(", defaultMainComponents=");
        sb2.append(this.defaultMainComponents);
        sb2.append(", bottomComponents=");
        return H.p(sb2, this.bottomComponents, ')');
    }

    public final boolean topDefaultFormIsPresent() {
        return defaultFormIsPresent(this.defaultTopFormId, this.defaultTopComponents);
    }

    public final boolean topFormChanged() {
        return !L.f(this.defaultTopComponents, this.topComponents);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.navigationBar.writeToParcel(parcel, flags);
        parcel.writeString(this.screenName);
        parcel.writeStringList(this.innerScreenNames);
        parcel.writeString(this.topFormId);
        parcel.writeString(this.defaultTopFormId);
        parcel.writeString(this.mainFormId);
        parcel.writeString(this.defaultMainFormId);
        parcel.writeString(this.bottomFormId);
        List<BeduinModel> list = this.topComponents;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinModel> list2 = this.defaultTopComponents;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        Iterator itJ = C0.j(this.mainComponents, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        List<BeduinModel> list3 = this.defaultMainComponents;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        Iterator itJ2 = C0.j(this.bottomComponents, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), flags);
        }
    }
}
