package Ku;

import Y61.k;
import android.net.Uri;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: DeepLinkParsingScope.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKu/i;", "", "<init>", "()V", "_common_network-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class i {
    public static void g(i iVar, Uri uri, String str) throws DeeplinkParsingError.Custom {
        iVar.getClass();
        throw new DeeplinkParsingError.Custom(uri.toString(), str, null);
    }

    @k
    public static void h(@k Uri uri, @k String str) throws DeeplinkParsingError.WrongParameterValue {
        throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), str, null, null, 12, null);
    }

    @k
    public static Map i(@k Uri uri) throws DeeplinkParsingError.Custom {
        try {
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery == null) {
                return P0.c();
            }
            if (encodedQuery.length() == 0) {
                return P0.c();
            }
            List listF0 = C43066x.f0(encodedQuery, new String[]{ContainerUtils.FIELD_DELIMITER}, 0, 6);
            int iF2 = P0.f(C42745f0.q(listF0, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            Iterator it = listF0.iterator();
            while (it.hasNext()) {
                List listF02 = C43066x.f0((String) it.next(), new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, 0, 6);
                linkedHashMap.put((String) listF02.get(0), (String) listF02.get(1));
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            throw new DeeplinkParsingError.Custom(uri.toString(), "Failed to parse queryMap from encodedQuery", th2);
        }
    }

    public static double j(@k Uri uri, @k String str) throws DeeplinkParsingError.WrongParameterValue {
        Double dW02;
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null || (dW02 = C43066x.w0(queryParameter)) == null) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), str, DeeplinkParsingError.FieldConstraint.a.f133997b, null, 8, null);
        }
        return dW02.doubleValue();
    }

    public static void k(@k Uri uri, @k DE0.a aVar) throws DeeplinkParsingError.FeatureToggleDisabled {
        if (!((Boolean) aVar.invoke()).booleanValue()) {
            throw new DeeplinkParsingError.FeatureToggleDisabled(uri.toString(), AK.c.k("Feature toggle ", aVar.getF3108c(), " is disabled"), null);
        }
    }

    public static int l(@k Uri uri, @k String str) throws DeeplinkParsingError.WrongParameterValue {
        Integer numY0;
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null || (numY0 = C43066x.y0(queryParameter)) == null) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), str, DeeplinkParsingError.FieldConstraint.b.f133998b, null, 8, null);
        }
        return numY0.intValue();
    }

    public static long m(@k Uri uri, @k String str) throws DeeplinkParsingError.WrongParameterValue {
        Long lZ02;
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null || (lZ02 = C43066x.z0(queryParameter)) == null) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), str, DeeplinkParsingError.FieldConstraint.c.f133999b, null, 8, null);
        }
        return lZ02.longValue();
    }

    @k
    public static String n(@k Uri uri, @k String str) throws DeeplinkParsingError.WrongParameterValue {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null || C43066x.K(queryParameter)) {
            queryParameter = null;
        }
        if (queryParameter != null) {
            return queryParameter;
        }
        throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), str, DeeplinkParsingError.FieldConstraint.String.f133994d, null, 8, null);
    }

    @k
    public static String o(@k Uri uri, @k String str) throws DeeplinkParsingError.WrongParameterValue {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null || queryParameter.length() <= 0) {
            queryParameter = null;
        }
        if (queryParameter != null) {
            return queryParameter;
        }
        throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), str, DeeplinkParsingError.FieldConstraint.String.f133993c, null, 8, null);
    }

    @k
    public static String p(@k Uri uri, @k String str) throws DeeplinkParsingError.WrongParameterValue {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return queryParameter;
        }
        throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), str, DeeplinkParsingError.FieldConstraint.String.f133992b, null, 8, null);
    }

    @k
    public static Uri q(@k Uri uri, @k String str) throws DeeplinkParsingError.WrongParameterValue {
        String queryParameter = uri.getQueryParameter(str);
        Uri uri2 = null;
        if (queryParameter != null) {
            if (C43066x.K(queryParameter)) {
                queryParameter = null;
            }
            if (queryParameter != null) {
                uri2 = Uri.parse(queryParameter);
            }
        }
        if (uri2 != null) {
            return uri2;
        }
        throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), str, DeeplinkParsingError.FieldConstraint.d.f134000b, null, 8, null);
    }
}
