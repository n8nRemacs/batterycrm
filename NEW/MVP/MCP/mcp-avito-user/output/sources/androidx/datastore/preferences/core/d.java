package androidx.datastore.preferences.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: PreferenceDataStoreFactory.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Ljava/io/File;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class d extends N implements Y41.a<File> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<File> f45563l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Y41.a<? extends File> aVar) {
        super(0);
        this.f45563l = aVar;
    }

    @Override // Y41.a
    public final File invoke() {
        File fileInvoke = this.f45563l.invoke();
        String strN0 = C43066x.n0('.', fileInvoke.getName(), "");
        k.f45569a.getClass();
        String str = k.f45570b;
        if (strN0.equals(str)) {
            return fileInvoke;
        }
        throw new IllegalStateException(("File extension for file: " + fileInvoke + " does not match required extension for Preferences file: " + str).toString());
    }
}
