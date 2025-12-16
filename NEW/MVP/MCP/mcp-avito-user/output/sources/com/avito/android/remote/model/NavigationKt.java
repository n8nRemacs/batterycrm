package com.avito.android.remote.model;

import Y41.l;
import Y61.k;
import androidx.compose.foundation.H;
import com.google.gson.Gson;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47203a;

/* compiled from: Navigation.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u0003H\u0002\u001a\"\u0010\u0000\u001a\u00020\u0001*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u00030\u0004H\u0002\u001a0\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00010\u0001*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u00030\u00042\u0006\u0010\u0007\u001a\u00020\b*\"\u0010\t\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00022\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\n"}, d2 = {"joinToString", "", "", "Lcom/avito/android/remote/model/Attribute;", "", "toAnalyticsFormat", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "Attribute", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class NavigationKt {

    /* compiled from: Navigation.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "Lcom/avito/android/remote/model/Attribute;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.model.NavigationKt$joinToString$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements l<Map<String, ? extends String>, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @k
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(@k Map<String, String> map) {
            return NavigationKt.joinToString(map);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Map<String, ? extends String> map) {
            return invoke2((Map<String, String>) map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String joinToString(Iterable<? extends Map<String, String>> iterable) {
        return C42745f0.O(iterable, "", "[", "]", AnonymousClass1.INSTANCE, 24);
    }

    public static final String toAnalyticsFormat(@k Iterable<? extends Map<String, String>> iterable, @k Gson gson) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map<String, String> map : iterable) {
            try {
                String str = map.get("id");
                if (str != null) {
                    String str2 = map.get("value");
                    linkedHashMap.put(str, str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return gson.l(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String joinToString(Map<String, String> map) {
        return C42745f0.O(map.entrySet(), ContainerUtils.FIELD_DELIMITER, "{", "}", AnonymousClass2.INSTANCE, 24);
    }

    /* compiled from: Navigation.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.model.NavigationKt$joinToString$2, reason: invalid class name */
    public static final class AnonymousClass2 extends N implements l<Map.Entry<? extends String, ? extends String>, CharSequence> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @k
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(@k Map.Entry<String, String> entry) {
            return H.i('=', entry.getKey(), entry.getValue());
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends String> entry) {
            return invoke2((Map.Entry<String, String>) entry);
        }
    }
}
