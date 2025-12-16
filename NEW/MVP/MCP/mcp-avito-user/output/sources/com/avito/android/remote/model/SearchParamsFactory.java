package com.avito.android.remote.model;

import Y61.k;
import android.net.Uri;
import androidx.compose.ui.graphics.colorspace.e;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.SplitSearchParam;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SearchParamsFactory.kt */
@s0
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u000fJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\"2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J'\u0010+\u001a\u00020\"2\u0018\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040)0\u0006¢\u0006\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00101\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010.R\u0014\u00102\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010.R\u0014\u00103\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010.R\u0014\u00104\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010.¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/SearchParamsFactory;", "", "<init>", "()V", "", "stringArray", "", "parseSubLocationIds", "(Ljava/lang/String;)Ljava/util/List;", "geoCoordsString", "Lcom/avito/android/remote/model/Coordinates;", "parseGeoCoords", "(Ljava/lang/String;)Lcom/avito/android/remote/model/Coordinates;", "encodedString", "decodeString", "(Ljava/lang/String;)Ljava/lang/String;", "", "Lcom/avito/android/remote/model/SearchParamElement;", "paramsMap", "key", "value", "Lkotlin/G0;", "addSearchParam", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "", "Lcom/avito/android/remote/model/SearchParam;", "paramsStringMapToSearchParamMap", "(Ljava/util/Map;)Ljava/util/Map;", "paramId", "getParamIdFromSplitId", "", "parseBoolean", "(Ljava/lang/String;)Ljava/lang/Boolean;", "searchParamsString", "Lcom/avito/android/remote/model/SearchParams;", "fromString", "(Ljava/lang/String;)Lcom/avito/android/remote/model/SearchParams;", "Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "fromUri", "(Landroid/net/Uri;)Lcom/avito/android/remote/model/SearchParams;", "Lkotlin/Q;", "params", "fromPairs", "(Ljava/util/List;)Lcom/avito/android/remote/model/SearchParams;", "PRIVATE", "Ljava/lang/String;", "COMPANY", "SEARCH_RADIUS", "RADIUS", "OWNER", "FORCE_LOCATION", "OWNER_REGEX", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SearchParamsFactory {

    @k
    private static final String COMPANY = "company";

    @k
    private static final String FORCE_LOCATION = "forceLocation";

    @k
    public static final SearchParamsFactory INSTANCE = new SearchParamsFactory();

    @k
    private static final String OWNER = "owner";

    @k
    private static final String OWNER_REGEX = "owner\\[([^]]+)]";

    @k
    private static final String PRIVATE = "private";

    @k
    private static final String RADIUS = "radius";

    @k
    private static final String SEARCH_RADIUS = "searchRadius";

    private SearchParamsFactory() {
    }

    private final void addSearchParam(Map<String, SearchParamElement> paramsMap, String key, String value) {
        String strGroup;
        Matcher matcher = Pattern.compile("params\\[([^]]+)\\]").matcher(key);
        if (!matcher.find() || (strGroup = matcher.group(1)) == null) {
            return;
        }
        if (!paramsMap.containsKey(strGroup)) {
            SearchParamElement searchParamElement = new SearchParamElement();
            searchParamElement.add(key, value);
            paramsMap.put(strGroup, searchParamElement);
        } else {
            SearchParamElement searchParamElement2 = paramsMap.get(strGroup);
            if (searchParamElement2 != null) {
                searchParamElement2.add(key, value);
            }
        }
    }

    private final String decodeString(String encodedString) {
        try {
            return URLDecoder.decode(encodedString, Constants.ENCODING);
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return encodedString;
        }
    }

    private final String getParamIdFromSplitId(String paramId) {
        return C43066x.z(paramId, SplitSearchParamKt.SPLIT_FROM, false) ? e.h(5, 0, paramId) : C43066x.z(paramId, SplitSearchParamKt.SPLIT_TO, false) ? e.h(3, 0, paramId) : paramId;
    }

    private final Map<String, SearchParam<?>> paramsStringMapToSearchParamMap(Map<String, SearchParamElement> paramsMap) {
        SplitSearchParam.Split split;
        HashMap map = new HashMap(paramsMap.size());
        for (String str : paramsMap.keySet()) {
            SearchParamElement searchParamElement = paramsMap.get(str);
            if (searchParamElement != null) {
                if (searchParamElement.getIsMultiselect()) {
                    map.put(str, new MultiSelectSearchParam(searchParamElement.getAll()));
                } else {
                    String str2 = searchParamElement.get(0);
                    if (C43066x.z(str, SplitSearchParamKt.SPLIT_FROM, false) || C43066x.z(str, SplitSearchParamKt.SPLIT_TO, false)) {
                        String paramIdFromSplitId = INSTANCE.getParamIdFromSplitId(str);
                        if (!map.containsKey(paramIdFromSplitId)) {
                            if (C43066x.z(str, SplitSearchParamKt.SPLIT_FROM, false)) {
                                SearchParamElement searchParamElement2 = paramsMap.get(paramIdFromSplitId + SplitSearchParamKt.SPLIT_TO);
                                split = new SplitSearchParam.Split(str2, searchParamElement2 != null ? searchParamElement2.get(0) : null);
                            } else {
                                SearchParamElement searchParamElement3 = paramsMap.get(paramIdFromSplitId + SplitSearchParamKt.SPLIT_FROM);
                                split = new SplitSearchParam.Split(searchParamElement3 != null ? searchParamElement3.get(0) : null, str2);
                            }
                            map.put(paramIdFromSplitId, new SplitSearchParam(split));
                        }
                    } else {
                        map.put(str, new StringSearchParam(str2));
                    }
                }
            }
        }
        return map;
    }

    private final Boolean parseBoolean(String value) {
        if (value != null) {
            return value.equals("1") ? Boolean.TRUE : value.equals("0") ? Boolean.FALSE : C43066x.v0(value);
        }
        return null;
    }

    private final Coordinates parseGeoCoords(String geoCoordsString) throws NumberFormatException {
        if (geoCoordsString == null) {
            return null;
        }
        String[] strArr = (String[]) C43066x.f0(geoCoordsString, new String[]{","}, 0, 6).toArray(new String[0]);
        if (strArr.length != 2) {
            return null;
        }
        try {
            String str = strArr[0];
            int length = str.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                boolean z13 = L.g(str.charAt(!z12 ? i12 : length), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    }
                    length--;
                } else if (z13) {
                    i12++;
                } else {
                    z12 = true;
                }
            }
            double d12 = Double.parseDouble(str.subSequence(i12, length + 1).toString());
            String str2 = strArr[1];
            int length2 = str2.length() - 1;
            int i13 = 0;
            boolean z14 = false;
            while (i13 <= length2) {
                boolean z15 = L.g(str2.charAt(!z14 ? i13 : length2), 32) <= 0;
                if (z14) {
                    if (!z15) {
                        break;
                    }
                    length2--;
                } else if (z15) {
                    i13++;
                } else {
                    z14 = true;
                }
            }
            return new Coordinates(d12, Double.parseDouble(str2.subSequence(i13, length2 + 1).toString()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final List<String> parseSubLocationIds(String stringArray) {
        String[] strArr = (C43066x.h0(stringArray, "[", false) && C43066x.z(stringArray, "]", false)) ? (String[]) C43066x.f0(e.h(1, 1, stringArray), new String[]{","}, 0, 6).toArray(new String[0]) : new String[]{stringArray};
        if (strArr.length == 0) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0283 A[PHI: r14
  0x0283: PHI (r14v31 com.avito.android.remote.model.SearchParams) = 
  (r14v3 com.avito.android.remote.model.SearchParams)
  (r14v4 com.avito.android.remote.model.SearchParams)
  (r14v5 com.avito.android.remote.model.SearchParams)
  (r14v6 com.avito.android.remote.model.SearchParams)
  (r14v7 com.avito.android.remote.model.SearchParams)
  (r14v8 com.avito.android.remote.model.SearchParams)
  (r14v9 com.avito.android.remote.model.SearchParams)
  (r14v10 com.avito.android.remote.model.SearchParams)
  (r14v11 com.avito.android.remote.model.SearchParams)
  (r14v12 com.avito.android.remote.model.SearchParams)
  (r14v13 com.avito.android.remote.model.SearchParams)
  (r14v14 com.avito.android.remote.model.SearchParams)
  (r14v15 com.avito.android.remote.model.SearchParams)
  (r14v16 com.avito.android.remote.model.SearchParams)
  (r14v17 com.avito.android.remote.model.SearchParams)
  (r14v18 com.avito.android.remote.model.SearchParams)
  (r14v19 com.avito.android.remote.model.SearchParams)
  (r14v20 com.avito.android.remote.model.SearchParams)
  (r14v21 com.avito.android.remote.model.SearchParams)
  (r14v22 com.avito.android.remote.model.SearchParams)
  (r14v23 com.avito.android.remote.model.SearchParams)
  (r14v32 com.avito.android.remote.model.SearchParams)
 binds: [B:116:0x0281, B:112:0x0271, B:108:0x0261, B:103:0x0249, B:98:0x0231, B:92:0x020f, B:86:0x01f0, B:78:0x01cf, B:74:0x01ba, B:70:0x01a9, B:66:0x0198, B:60:0x0181, B:56:0x0170, B:52:0x015b, B:48:0x0146, B:44:0x0131, B:40:0x0120, B:36:0x010f, B:32:0x00fe, B:28:0x00ed, B:20:0x00cc, B:7:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0291  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.SearchParams fromPairs(@Y61.k java.util.List<kotlin.Q<java.lang.String, java.lang.String>> r40) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.model.SearchParamsFactory.fromPairs(java.util.List):com.avito.android.remote.model.SearchParams");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Y61.k
    public final com.avito.android.remote.model.SearchParams fromString(@Y61.l java.lang.String r40) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.model.SearchParamsFactory.fromString(java.lang.String):com.avito.android.remote.model.SearchParams");
    }

    @k
    public final SearchParams fromUri(@k Uri uri) {
        Q q12;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery != null) {
            String[] strArr = (String[]) C43066x.f0(encodedQuery, new String[]{ContainerUtils.FIELD_DELIMITER}, 0, 6).toArray(new String[0]);
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                String[] strArr2 = (String[]) C43066x.f0(str, new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, 0, 6).toArray(new String[0]);
                if (strArr2.length != 2) {
                    q12 = null;
                } else {
                    SearchParamsFactory searchParamsFactory = INSTANCE;
                    q12 = new Q(searchParamsFactory.decodeString(strArr2[0]), searchParamsFactory.decodeString(strArr2[1]));
                }
                if (q12 != null) {
                    arrayList.add(q12);
                }
            }
            SearchParams searchParamsFromPairs = INSTANCE.fromPairs(arrayList);
            if (searchParamsFromPairs != null) {
                return searchParamsFromPairs;
            }
        }
        return new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
    }
}
