package org.commonmark.internal.util;

import androidx.compose.ui.graphics.colorspace.e;
import com.adjust.sdk.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Html5Entities.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, String> f420370a;

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f420371b;

    static {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(b.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), Charset.forName(Constants.ENCODING)));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        map.put("NewLine", "\n");
                        f420370a = map;
                        f420371b = Pattern.compile("^&#[Xx]?");
                        return;
                    }
                    if (line.length() != 0) {
                        int iIndexOf = line.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                        map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                    }
                } finally {
                }
            }
        } catch (IOException e12) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e12);
        }
    }

    public static String a(String str) throws NumberFormatException {
        Matcher matcher = f420371b.matcher(str);
        if (!matcher.find()) {
            String str2 = f420370a.get(e.h(1, 1, str));
            return str2 != null ? str2 : str;
        }
        try {
            int i12 = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), matcher.end() == 2 ? 10 : 16);
            return i12 == 0 ? "�" : new String(Character.toChars(i12));
        } catch (IllegalArgumentException unused) {
            return "�";
        }
    }
}
