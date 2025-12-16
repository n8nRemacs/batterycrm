package com.google.android.exoplayer2;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C36604u;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C36561t implements C36604u.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f346706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f346707c;

    public /* synthetic */ C36561t(Object obj, int i12) {
        this.f346706b = i12;
        this.f346707c = obj;
    }

    @Override // com.google.android.exoplayer2.util.C36604u.a
    public final void invoke(Object obj) {
        Object obj2 = this.f346707c;
        d0.g gVar = (d0.g) obj;
        switch (this.f346706b) {
            case 0:
                int i12 = C.f343308n0;
                gVar.onMediaMetadataChanged((P) obj2);
                break;
            case 1:
                int i13 = C.f343308n0;
                gVar.onTrackSelectionParametersChanged((com.google.android.exoplayer2.trackselection.r) obj2);
                break;
            case 2:
                gVar.onMediaMetadataChanged(C.this.f343324P);
                break;
            case 3:
                gVar.onCues((List<com.google.android.exoplayer2.text.a>) obj2);
                break;
            case 4:
                gVar.onCues((com.google.android.exoplayer2.text.d) obj2);
                break;
            case 5:
                gVar.onMetadata((Metadata) obj2);
                break;
            case 6:
                gVar.onDeviceInfoChanged((C36533n) obj2);
                break;
            default:
                gVar.onVideoSizeChanged((com.google.android.exoplayer2.video.o) obj2);
                break;
        }
    }
}
