package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.form.ParamsSource;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinExecuteRequestAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0002GHB¢\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0019\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b\u0012&\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006\u0018\u00010\u0006j\u0004\u0018\u0001`\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001d\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006\u0018\u00010\u0006j\u0004\u0018\u0001`\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u0019J¿\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2(\b\u0002\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006\u0018\u00010\u0006j\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020+HÖ\u0001¢\u0006\u0004\b1\u0010-J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020+HÖ\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u0019R*\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010\u001eR7\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006\u0018\u00010\u0006j\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b>\u0010\u001eR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010!R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bA\u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\bC\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bD\u0010$R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\bE\u0010\u0019R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\bF\u0010\u0019¨\u0006I"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinExecuteRequestAction;", "Lcom/avito/android/beduin_shared/model/action/BeduinExecuteRequestAction;", "Lcom/avito/android/beduin/common/action/BeduinExecuteRequestAction$HttpMethod;", "method", "", "path", "", "", "LK51/e;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/beduin_shared/model/form/FormParametersDictionary;", "formParamsMap", "", "Lcom/avito/android/beduin_shared/model/form/ParamsSource;", "paramsSources", "Lcom/avito/android/beduin_models/BeduinAction;", "onFailActions", "", "showActivityIndicator", "showErrorAlertOnFail", "deduplicateRequestId", "screenContentType", "<init>", "(Lcom/avito/android/beduin/common/action/BeduinExecuteRequestAction$HttpMethod;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getContentTypeOrDefault", "()Ljava/lang/String;", "component1", "()Lcom/avito/android/beduin/common/action/BeduinExecuteRequestAction$HttpMethod;", "component2", "component3", "()Ljava/util/Map;", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "copy", "(Lcom/avito/android/beduin/common/action/BeduinExecuteRequestAction$HttpMethod;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/beduin/common/action/BeduinExecuteRequestAction;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/action/BeduinExecuteRequestAction$HttpMethod;", "getMethod", "Ljava/lang/String;", "getPath", "Ljava/util/Map;", "getParameters", "getFormParamsMap", "Ljava/util/List;", "getParamsSources", "getOnFailActions", "Ljava/lang/Boolean;", "getShowActivityIndicator", "getShowErrorAlertOnFail", "getDeduplicateRequestId", "getScreenContentType", "b", "HttpMethod", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinExecuteRequestAction implements com.avito.android.beduin_shared.model.action.BeduinExecuteRequestAction {

    @Y61.k
    public static final Parcelable.Creator<BeduinExecuteRequestAction> CREATOR = new a();

    @l
    private final String deduplicateRequestId;

    @l
    private final Map<String, Map<String, String>> formParamsMap;

    @Y61.k
    private final HttpMethod method;

    @l
    private final List<BeduinAction> onFailActions;

    @l
    private final Map<String, Object> parameters;

    @l
    private final List<ParamsSource> paramsSources;

    @Y61.k
    private final String path;

    @l
    private final String screenContentType;

    @l
    private final Boolean showActivityIndicator;

    @l
    private final Boolean showErrorAlertOnFail;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinExecuteRequestAction.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinExecuteRequestAction$HttpMethod;", "", "(Ljava/lang/String;I)V", "POST", "GET", "DELETE", "PUT", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HttpMethod {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ HttpMethod[] $VALUES;
        public static final HttpMethod POST = new HttpMethod("POST", 0);
        public static final HttpMethod GET = new HttpMethod("GET", 1);
        public static final HttpMethod DELETE = new HttpMethod("DELETE", 2);
        public static final HttpMethod PUT = new HttpMethod("PUT", 3);

        private static final /* synthetic */ HttpMethod[] $values() {
            return new HttpMethod[]{POST, GET, DELETE, PUT};
        }

        static {
            HttpMethod[] httpMethodArr$values = $values();
            $VALUES = httpMethodArr$values;
            $ENTRIES = kotlin.enums.c.a(httpMethodArr$values);
        }

        private HttpMethod(String str, int i12) {
        }

        @Y61.k
        public static kotlin.enums.a<HttpMethod> getEntries() {
            return $ENTRIES;
        }

        public static HttpMethod valueOf(String str) {
            return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
        }

        public static HttpMethod[] values() {
            return (HttpMethod[]) $VALUES.clone();
        }
    }

    /* compiled from: BeduinExecuteRequestAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinExecuteRequestAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinExecuteRequestAction createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            ArrayList arrayList;
            ArrayList arrayList2;
            HttpMethod httpMethodValueOf = HttpMethod.valueOf(parcel.readString());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = org.webrtc.h.c(BeduinExecuteRequestAction.class, parcel, linkedHashMap3, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap3;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    String string2 = parcel.readString();
                    int i15 = parcel.readInt();
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(i15);
                    int iA2 = 0;
                    while (iA2 != i15) {
                        iA2 = C0.a(parcel, linkedHashMap5, parcel.readString(), iA2, 1);
                    }
                    linkedHashMap4.put(string2, linkedHashMap5);
                }
                linkedHashMap2 = linkedHashMap4;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i16);
                int iL2 = 0;
                while (iL2 != i16) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinExecuteRequestAction.class, parcel, arrayList3, iL2, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i17);
                int iL3 = 0;
                while (iL3 != i17) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinExecuteRequestAction.class, parcel, arrayList4, iL3, 1);
                }
                arrayList2 = arrayList4;
            }
            return new BeduinExecuteRequestAction(httpMethodValueOf, string, linkedHashMap, linkedHashMap2, arrayList, arrayList2, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinExecuteRequestAction[] newArray(int i12) {
            return new BeduinExecuteRequestAction[i12];
        }
    }

    /* compiled from: BeduinExecuteRequestAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinExecuteRequestAction$b;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC15524c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Class<? extends BeduinAction> f99981b = BeduinExecuteRequestAction.class;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f99982c = "executeRequest";

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return this.f99981b;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType, reason: from getter */
        public final String getF105301c() {
            return this.f99982c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinExecuteRequestAction(@Y61.k HttpMethod httpMethod, @Y61.k String str, @l Map<String, ? extends Object> map, @l Map<String, ? extends Map<String, String>> map2, @l List<? extends ParamsSource> list, @l List<? extends BeduinAction> list2, @l Boolean bool, @l Boolean bool2, @l String str2, @l String str3) {
        this.method = httpMethod;
        this.path = str;
        this.parameters = map;
        this.formParamsMap = map2;
        this.paramsSources = list;
        this.onFailActions = list2;
        this.showActivityIndicator = bool;
        this.showErrorAlertOnFail = bool2;
        this.deduplicateRequestId = str2;
        this.screenContentType = str3;
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final HttpMethod getMethod() {
        return this.method;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getScreenContentType() {
        return this.screenContentType;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @l
    public final Map<String, Object> component3() {
        return this.parameters;
    }

    @l
    public final Map<String, Map<String, String>> component4() {
        return this.formParamsMap;
    }

    @l
    public final List<ParamsSource> component5() {
        return this.paramsSources;
    }

    @l
    public final List<BeduinAction> component6() {
        return this.onFailActions;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getShowActivityIndicator() {
        return this.showActivityIndicator;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getShowErrorAlertOnFail() {
        return this.showErrorAlertOnFail;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getDeduplicateRequestId() {
        return this.deduplicateRequestId;
    }

    @Y61.k
    public final BeduinExecuteRequestAction copy(@Y61.k HttpMethod method, @Y61.k String path, @l Map<String, ? extends Object> parameters, @l Map<String, ? extends Map<String, String>> formParamsMap, @l List<? extends ParamsSource> paramsSources, @l List<? extends BeduinAction> onFailActions, @l Boolean showActivityIndicator, @l Boolean showErrorAlertOnFail, @l String deduplicateRequestId, @l String screenContentType) {
        return new BeduinExecuteRequestAction(method, path, parameters, formParamsMap, paramsSources, onFailActions, showActivityIndicator, showErrorAlertOnFail, deduplicateRequestId, screenContentType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinExecuteRequestAction)) {
            return false;
        }
        BeduinExecuteRequestAction beduinExecuteRequestAction = (BeduinExecuteRequestAction) other;
        return this.method == beduinExecuteRequestAction.method && L.f(this.path, beduinExecuteRequestAction.path) && L.f(this.parameters, beduinExecuteRequestAction.parameters) && L.f(this.formParamsMap, beduinExecuteRequestAction.formParamsMap) && L.f(this.paramsSources, beduinExecuteRequestAction.paramsSources) && L.f(this.onFailActions, beduinExecuteRequestAction.onFailActions) && L.f(this.showActivityIndicator, beduinExecuteRequestAction.showActivityIndicator) && L.f(this.showErrorAlertOnFail, beduinExecuteRequestAction.showErrorAlertOnFail) && L.f(this.deduplicateRequestId, beduinExecuteRequestAction.deduplicateRequestId) && L.f(this.screenContentType, beduinExecuteRequestAction.screenContentType);
    }

    @Y61.k
    public final String getContentTypeOrDefault() {
        String str = this.screenContentType;
        return str == null ? "unknown-execute-request-content-type" : str;
    }

    @l
    public final String getDeduplicateRequestId() {
        return this.deduplicateRequestId;
    }

    @l
    public final Map<String, Map<String, String>> getFormParamsMap() {
        return this.formParamsMap;
    }

    @Y61.k
    public final HttpMethod getMethod() {
        return this.method;
    }

    @l
    public final List<BeduinAction> getOnFailActions() {
        return this.onFailActions;
    }

    @l
    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    @l
    public final List<ParamsSource> getParamsSources() {
        return this.paramsSources;
    }

    @Override // com.avito.android.beduin_shared.model.action.BeduinExecuteRequestAction
    @Y61.k
    public String getPath() {
        return this.path;
    }

    @l
    public final String getScreenContentType() {
        return this.screenContentType;
    }

    @l
    public final Boolean getShowActivityIndicator() {
        return this.showActivityIndicator;
    }

    @l
    public final Boolean getShowErrorAlertOnFail() {
        return this.showErrorAlertOnFail;
    }

    public int hashCode() {
        int iD2 = H.d(this.method.hashCode() * 31, 31, this.path);
        Map<String, Object> map = this.parameters;
        int iHashCode = (iD2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Map<String, String>> map2 = this.formParamsMap;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        List<ParamsSource> list = this.paramsSources;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.onFailActions;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.showActivityIndicator;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showErrorAlertOnFail;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.deduplicateRequestId;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.screenContentType;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinExecuteRequestAction(method=");
        sb2.append(this.method);
        sb2.append(", path=");
        sb2.append(this.path);
        sb2.append(", parameters=");
        sb2.append(this.parameters);
        sb2.append(", formParamsMap=");
        sb2.append(this.formParamsMap);
        sb2.append(", paramsSources=");
        sb2.append(this.paramsSources);
        sb2.append(", onFailActions=");
        sb2.append(this.onFailActions);
        sb2.append(", showActivityIndicator=");
        sb2.append(this.showActivityIndicator);
        sb2.append(", showErrorAlertOnFail=");
        sb2.append(this.showErrorAlertOnFail);
        sb2.append(", deduplicateRequestId=");
        sb2.append(this.deduplicateRequestId);
        sb2.append(", screenContentType=");
        return C22026a.c(sb2, this.screenContentType, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.method.name());
        parcel.writeString(this.path);
        Map<String, Object> map = this.parameters;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        Map<String, Map<String, String>> map2 = this.formParamsMap;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH2 = C0.h(parcel, 1, map2);
            while (itH2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itH2.next();
                parcel.writeString((String) entry2.getKey());
                Iterator itI = C0.i(parcel, (Map) entry2.getValue());
                while (itI.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) itI.next();
                    parcel.writeString((String) entry3.getKey());
                    parcel.writeString((String) entry3.getValue());
                }
            }
        }
        List<ParamsSource> list = this.paramsSources;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.onFailActions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        Boolean bool = this.showActivityIndicator;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.showErrorAlertOnFail;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeString(this.deduplicateRequestId);
        parcel.writeString(this.screenContentType);
    }
}
