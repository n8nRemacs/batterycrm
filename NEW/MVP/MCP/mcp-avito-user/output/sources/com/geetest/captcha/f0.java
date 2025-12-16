package com.geetest.captcha;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.C43066x;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/geetest/captcha/utils/HttpUrl;", "", "", "baseUrl", "", "params", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "Lcom/geetest/captcha/utils/HttpUrl$Builder;", "newBuilder", "()Lcom/geetest/captcha/utils/HttpUrl$Builder;", "Ljava/lang/String;", "Ljava/util/Map;", "Builder", "Companion", "captcha_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f342719c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f342720a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, String> f342721b;

    public static final class a {
        @Y61.l
        public final f0 a(@Y61.k String str) {
            try {
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            if (C43066x.K(str)) {
                return null;
            }
            Object[] array = C43066x.f0(C43066x.A0(str).toString(), new String[]{"?"}, 0, 6).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            HashMap map = new HashMap();
            if (strArr.length == 1) {
                return new f0(strArr[0], map);
            }
            if (strArr.length == 2) {
                Object[] array2 = C43066x.f0(strArr[1], new String[]{ContainerUtils.FIELD_DELIMITER}, 0, 6).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                for (String str2 : (String[]) array2) {
                    Object[] array3 = C43066x.f0(str2, new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, 0, 6).toArray(new String[0]);
                    if (array3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr2 = (String[]) array3;
                    if (strArr2.length == 2) {
                        map.put(strArr2[0], strArr2[1]);
                    }
                }
                return new f0(strArr[0], map);
            }
            return null;
        }
    }

    public f0(String str, Map<String, String> map) {
        this.f342720a = str;
        this.f342721b = map;
    }

    @Y61.k
    public String toString() {
        Map<String, String> map = this.f342721b;
        if (map == null || map.isEmpty()) {
            return this.f342720a;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f342720a);
        stringBuffer.append('?');
        for (Map.Entry<String, String> entry : this.f342721b.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            stringBuffer.append(key);
            stringBuffer.append('=');
            stringBuffer.append(value);
            stringBuffer.append('&');
        }
        return stringBuffer.deleteCharAt(stringBuffer.length() - 1).toString();
    }
}
