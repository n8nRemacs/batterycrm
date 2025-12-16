package com.yandex.metrica.plugins;

import com.yandex.metrica.impl.ob.A2;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class PluginErrorDetails {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final String f382465a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f382466b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final ArrayList f382467c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f382468d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final String f382469e;

    /* renamed from: f, reason: collision with root package name */
    @N
    public final Map<String, String> f382470f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        @P
        public String f382471a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public String f382472b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public List<StackTraceItem> f382473c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public String f382474d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public String f382475e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public Map<String, String> f382476f;

        @N
        public PluginErrorDetails build() {
            String str = this.f382471a;
            String str2 = this.f382472b;
            List<StackTraceItem> list = this.f382473c;
            List<StackTraceItem> arrayList = new ArrayList<>();
            if (list != null) {
                arrayList = list;
            }
            String str3 = this.f382474d;
            String str4 = this.f382475e;
            Map<String, String> map = this.f382476f;
            Map<String, String> map2 = new HashMap<>();
            if (map != null) {
                map2 = map;
            }
            return new PluginErrorDetails(str, str2, arrayList, str3, str4, map2, null);
        }

        @N
        public Builder withExceptionClass(@P String str) {
            this.f382471a = str;
            return this;
        }

        @N
        public Builder withMessage(@P String str) {
            this.f382472b = str;
            return this;
        }

        @N
        public Builder withPlatform(@P String str) {
            this.f382474d = str;
            return this;
        }

        @N
        public Builder withPluginEnvironment(@P Map<String, String> map) {
            this.f382476f = map;
            return this;
        }

        @N
        public Builder withStacktrace(@P List<StackTraceItem> list) {
            this.f382473c = list;
            return this;
        }

        @N
        public Builder withVirtualMachineVersion(@P String str) {
            this.f382475e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public PluginErrorDetails() {
        throw null;
    }

    public PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, a aVar) {
        this.f382465a = str;
        this.f382466b = str2;
        this.f382467c = new ArrayList(list);
        this.f382468d = str3;
        this.f382469e = str4;
        this.f382470f = A2.a(A2.a(map));
    }

    @P
    public String getExceptionClass() {
        return this.f382465a;
    }

    @P
    public String getMessage() {
        return this.f382466b;
    }

    @P
    public String getPlatform() {
        return this.f382468d;
    }

    @N
    public Map<String, String> getPluginEnvironment() {
        return this.f382470f;
    }

    @N
    public List<StackTraceItem> getStacktrace() {
        return this.f382467c;
    }

    @P
    public String getVirtualMachineVersion() {
        return this.f382469e;
    }
}
