package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: PreferenceDataStoreDelegate.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Ljava/io/File;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class d extends N implements Y41.a<File> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f45572l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f45573m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, e eVar) {
        super(0);
        this.f45572l = context;
        this.f45573m = eVar;
    }

    @Override // Y41.a
    public final File invoke() {
        return new File(this.f45572l.getApplicationContext().getFilesDir(), L.j(L.j(".preferences_pb", this.f45573m.f45574b), "datastore/"));
    }
}
