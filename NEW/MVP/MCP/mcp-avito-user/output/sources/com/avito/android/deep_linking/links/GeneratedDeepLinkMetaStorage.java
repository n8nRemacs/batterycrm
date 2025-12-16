package com.avito.android.deep_linking.links;

import Iu.C14159a;
import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: GeneratedDeepLinkMetaStorage.kt */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \t2\u00020\u0001:\u0001\nR(\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/avito/android/deep_linking/links/GeneratedDeepLinkMetaStorage;", "", "", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/p;", "LIu/a;", "getClassesToMetaInfo", "()Ljava/util/Map;", GeneratedDeepLinkMetaStorage.PROPERTY, "Companion", "a", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface GeneratedDeepLinkMetaStorage {

    @Y61.k
    public static final String CLASS = "GeneratedDeeplinkMetaStorage";

    @Y61.k
    public static final String COMPOSED_STORAGE_QUALIFIED_CLASS_NAME = "com.avito.android.deep_linking.links.ComposedGeneratedDeeplinkMetaStorage";

    @Y61.k
    public static final String COMPOSED_STORAGE_SIMPLE_CLASS_NAME = "ComposedGeneratedDeeplinkMetaStorage";

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = Companion.f133334a;

    @Y61.k
    public static final String PACKAGE = "com.avito.android.deep_linking.links";

    @Y61.k
    public static final String PROPERTY = "classesToMetaInfo";

    /* compiled from: GeneratedDeepLinkMetaStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/GeneratedDeepLinkMetaStorage$a;", "", "<init>", "()V", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deep_linking.links.GeneratedDeepLinkMetaStorage$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f133334a = new Companion();
    }

    @Y61.k
    Map<Class<? extends p>, C14159a> getClassesToMetaInfo();
}
