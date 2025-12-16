package com.avito.android.publish.restriction;

import com.avito.android.remote.model.category_parameters.RestrictionConfig;
import kotlin.Metadata;

/* compiled from: ResponseMapper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: ResponseMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.restriction.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C7186a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f239075a;

        static {
            int[] iArr = new int[RestrictionConfig.Flow.values().length];
            try {
                iArr[RestrictionConfig.Flow.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RestrictionConfig.Flow.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f239075a = iArr;
        }
    }
}
