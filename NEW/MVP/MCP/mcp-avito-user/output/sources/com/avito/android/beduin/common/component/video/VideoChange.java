package com.avito.android.beduin.common.component.video;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoChange.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/video/VideoChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/video/BeduinVideoModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VideoChange implements e.a<BeduinVideoModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final VideoChange f102883c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ VideoChange[] f102884d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102885e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<BeduinVideoModel, Object> f102886b;

    /* compiled from: VideoChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/video/BeduinVideoModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<BeduinVideoModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f102887l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinVideoModel beduinVideoModel) {
            return beduinVideoModel.getState();
        }
    }

    static {
        VideoChange videoChange = new VideoChange(a.f102887l);
        f102883c = videoChange;
        VideoChange[] videoChangeArr = {videoChange};
        f102884d = videoChangeArr;
        f102885e = kotlin.enums.c.a(videoChangeArr);
    }

    public VideoChange(l lVar) {
        this.f102886b = lVar;
    }

    public static VideoChange valueOf(String str) {
        return (VideoChange) Enum.valueOf(VideoChange.class, str);
    }

    public static VideoChange[] values() {
        return (VideoChange[]) f102884d.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        return BeduinVideoModel.copy$default((BeduinVideoModel) beduinModel, null, null, null, BeduinVideoState.PLAYING, null, null, null, null, null, null, 1015, null);
    }
}
