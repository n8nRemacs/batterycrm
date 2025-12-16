package androidx.media3.extractor.text.webvtt;

import androidx.media3.extractor.text.webvtt.g;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f51489b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f51489b) {
            case 0:
                return Integer.compare(((g.b) obj).f51470a.f51473b, ((g.b) obj2).f51470a.f51473b);
            default:
                return Long.compare(((e) obj).f51463b, ((e) obj2).f51463b);
        }
    }
}
