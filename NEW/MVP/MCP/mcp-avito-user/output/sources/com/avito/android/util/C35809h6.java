package com.avito.android.util;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: Uris.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* renamed from: com.avito.android.util.h6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35809h6 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final String[] f318898a = {"http://", "https://", "rtsp://"};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String[] f318899b = {"http", Constants.SCHEME, "rtsp"};

    /* compiled from: Uris.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.h6$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Map.Entry<? extends String, ? extends String>, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f318900l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(Map.Entry<? extends String, ? extends String> entry) {
            Map.Entry<? extends String, ? extends String> entry2 = entry;
            return androidx.compose.foundation.H.i('=', entry2.getKey(), entry2.getValue());
        }
    }

    public static final boolean a(@Y61.l Uri uri) {
        return uri == null || uri.equals(Uri.EMPTY);
    }

    @Y61.k
    public static final Uri b(@Y61.k Uri uri, int i12) {
        String queryParameter = uri.getQueryParameter("offset");
        if (queryParameter == null) {
            return uri;
        }
        for (int i13 = 0; i13 < queryParameter.length(); i13++) {
            if (!Character.isDigit(queryParameter.charAt(i13))) {
                return uri;
            }
        }
        String strValueOf = String.valueOf(Integer.parseInt(queryParameter) + i12);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            builderClearQuery.appendQueryParameter(str, kotlin.jvm.internal.L.f(str, "offset") ? strValueOf : uri.getQueryParameter(str));
        }
        return builderClearQuery.build();
    }

    @Y61.k
    public static final Uri c(@Y61.k Uri uri, @Y61.k String str, @Y61.k String str2) {
        return d(uri, Collections.singletonMap(str, str2));
    }

    @Y61.k
    public static final Uri d(@Y61.k Uri uri, @Y61.k Map<String, String> map) {
        Iterable iterableUnmodifiableSet;
        int i12;
        if (map.isEmpty()) {
            return uri;
        }
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        String encodedQuery = uri.getEncodedQuery();
        char c12 = '=';
        boolean z12 = false;
        int i13 = 4;
        if (encodedQuery == null) {
            iterableUnmodifiableSet = kotlin.collections.B0.f406639b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i14 = 0;
            do {
                int iH2 = C43066x.H('&', i14, 4, encodedQuery);
                if (iH2 == -1) {
                    iH2 = encodedQuery.length();
                }
                int iH3 = C43066x.H('=', i14, 4, encodedQuery);
                if (iH3 > iH2 || iH3 == -1) {
                    iH3 = iH2;
                }
                linkedHashSet.add(encodedQuery.substring(i14, iH3));
                i14 = iH2 + 1;
            } while (i14 < encodedQuery.length());
            iterableUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        }
        Iterable iterable = iterableUnmodifiableSet;
        int iF2 = kotlin.collections.P0.f(C42745f0.q(iterable, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : iterable) {
            String str = (String) obj;
            String encodedQuery2 = uri.getEncodedQuery();
            String strSubstring = null;
            if (encodedQuery2 != null) {
                int length = encodedQuery2.length();
                int i15 = z12 ? 1 : 0;
                while (true) {
                    int I12 = C43066x.I(encodedQuery2, ContainerUtils.FIELD_DELIMITER, i15, z12, i13);
                    int i16 = I12 != -1 ? I12 : length;
                    int iH4 = C43066x.H(c12, i15, i13, encodedQuery2);
                    int i17 = (iH4 > i16 || iH4 == -1) ? i16 : iH4;
                    if (i17 - i15 == str.length()) {
                        int i18 = i17;
                        int i19 = i16;
                        i12 = I12;
                        if (C43066x.S(encodedQuery2, i15, str, 0, str.length(), false)) {
                            strSubstring = i18 == i19 ? "" : encodedQuery2.substring(i18 + 1, i19);
                        }
                    } else {
                        i12 = I12;
                    }
                    if (i12 == -1) {
                        break;
                    }
                    i15 = i12 + 1;
                    c12 = '=';
                    z12 = false;
                    i13 = 4;
                }
            }
            linkedHashMap.put(obj, strSubstring);
            c12 = '=';
            z12 = false;
            i13 = 4;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strEncode = Uri.encode(entry.getKey());
            String strDecode = Uri.decode(entry.getKey());
            if (linkedHashMap2.containsKey(strEncode)) {
                linkedHashMap2.put(strEncode, entry.getValue());
            } else if (linkedHashMap2.containsKey(strDecode)) {
                linkedHashMap2.put(strDecode, entry.getValue());
            } else {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        builderClearQuery.encodedQuery(C42745f0.O(linkedHashMap2.entrySet(), ContainerUtils.FIELD_DELIMITER, null, null, a.f318900l, 30));
        return builderClearQuery.build();
    }

    @Y61.k
    public static final Uri e(@Y61.k Uri uri, long j12) {
        return uri.buildUpon().appendEncodedPath(String.valueOf(j12)).build();
    }
}
