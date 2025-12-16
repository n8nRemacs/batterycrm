package com.avito.android.iac_avcalls.public_module.video;

import Y61.k;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* compiled from: AvCallsSurfaceViewRendererApi.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/video/AvCallsSurfaceViewRendererApi;", "", "ScalingTypeAspect", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface AvCallsSurfaceViewRendererApi {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvCallsSurfaceViewRendererApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/video/AvCallsSurfaceViewRendererApi$ScalingTypeAspect;", "", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScalingTypeAspect {

        /* renamed from: b, reason: collision with root package name */
        public static final ScalingTypeAspect f164620b;

        /* renamed from: c, reason: collision with root package name */
        public static final ScalingTypeAspect f164621c;

        /* renamed from: d, reason: collision with root package name */
        public static final ScalingTypeAspect f164622d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ScalingTypeAspect[] f164623e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ a f164624f;

        static {
            ScalingTypeAspect scalingTypeAspect = new ScalingTypeAspect("FIT", 0);
            f164620b = scalingTypeAspect;
            ScalingTypeAspect scalingTypeAspect2 = new ScalingTypeAspect("FILL", 1);
            f164621c = scalingTypeAspect2;
            ScalingTypeAspect scalingTypeAspect3 = new ScalingTypeAspect("BALANCED", 2);
            f164622d = scalingTypeAspect3;
            ScalingTypeAspect[] scalingTypeAspectArr = {scalingTypeAspect, scalingTypeAspect2, scalingTypeAspect3};
            f164623e = scalingTypeAspectArr;
            f164624f = c.a(scalingTypeAspectArr);
        }

        public ScalingTypeAspect() {
            throw null;
        }

        public static ScalingTypeAspect valueOf(String str) {
            return (ScalingTypeAspect) Enum.valueOf(ScalingTypeAspect.class, str);
        }

        public static ScalingTypeAspect[] values() {
            return (ScalingTypeAspect[]) f164623e.clone();
        }
    }

    @k
    View a(@k Context context);

    void b(@k View view, boolean z12);

    void c(@k View view);

    void d(@k View view, @k String str, boolean z12, @k String str2);

    void e(@k View view, @k ScalingTypeAspect scalingTypeAspect);

    void f(@k View view, boolean z12);
}
