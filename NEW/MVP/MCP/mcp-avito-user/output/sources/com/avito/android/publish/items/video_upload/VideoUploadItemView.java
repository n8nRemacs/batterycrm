package com.avito.android.publish.items.video_upload;

import android.net.Uri;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.OnboardingV2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VideoUploadItemView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/video_upload/VideoUploadItemView;", "LTV0/e;", "Lcom/avito/android/publish/items/video_upload/o;", "State", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface VideoUploadItemView extends TV0.e, o {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoUploadItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/video_upload/VideoUploadItemView$State;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f237254b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f237255c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f237256d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f237257e;

        /* renamed from: f, reason: collision with root package name */
        public static final State f237258f;

        /* renamed from: g, reason: collision with root package name */
        public static final State f237259g;

        /* renamed from: h, reason: collision with root package name */
        public static final State f237260h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ State[] f237261i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f237262j;

        static {
            State state = new State("VIDEO_NOT_PICKED", 0);
            f237254b = state;
            State state2 = new State("VIDEO_PICKED_AND_HAS_THUMBNAIL", 1);
            f237255c = state2;
            State state3 = new State("VIDEO_PICKED_AND_HAS_NOT_THUMBNAIL", 2);
            f237256d = state3;
            State state4 = new State("VIDEO_PICKED_AND_UPLOADING", 3);
            f237257e = state4;
            State state5 = new State("VIDEO_RETRY_UPLOADING", 4);
            f237258f = state5;
            State state6 = new State("VIDEO_UPLOADING_ERROR", 5);
            f237259g = state6;
            State state7 = new State("VIDEO_UPLOADING_COMPLETED", 6);
            f237260h = state7;
            State[] stateArr = {state, state2, state3, state4, state5, state6, state7};
            f237261i = stateArr;
            f237262j = kotlin.enums.c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f237261i.clone();
        }
    }

    /* compiled from: VideoUploadItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void C50(@Y61.k ParameterElement.J j12);

    void K0(@Y61.l String str, boolean z12);

    void Lg(@Y61.k State state, @Y61.l Uri uri);

    void NC(@Y61.k CharSequence charSequence);

    void OE();

    void Ot(@Y61.l DeepLink deepLink, @Y61.l String str, @Y61.l String str2);

    void Qk(@Y61.l e eVar);

    void Sm(@Y61.k Uri uri);

    void Xv(@Y61.k Y41.a aVar, @Y61.l String str, @Y61.l String str2);

    void af();

    void gi(@Y61.l com.avito.android.job.cv_info_actualization.ui.items.radio.g gVar);

    void h(@Y61.l String str);

    void l40(@Y61.k Y41.a<G0> aVar);

    void oG(boolean z12);

    void setTitle(@Y61.l CharSequence charSequence);

    void tY(@Y61.k OnboardingV2 onboardingV2, @Y61.l ClickStreamLink clickStreamLink);

    void vh(@Y61.l e eVar);

    void w70(@Y61.l String str, boolean z12);

    void x(@Y61.k com.avito.android.image_loader.k kVar);
}
