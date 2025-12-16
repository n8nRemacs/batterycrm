package kotlin.io.path;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: PathRecursiveFunctions.kt */
@e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/io/path/b;", "Lkotlin/io/path/a;", "<init>", "()V", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.io.path.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42798b implements InterfaceC42797a {
    static {
        new C42798b();
    }

    @Override // kotlin.io.path.InterfaceC42797a
    @Y61.k
    public final void a(@Y61.k Path path, @Y61.k Path path2) throws IOException {
        i.f406808a.getClass();
        LinkOption[] linkOptionArr = i.f406809b;
        LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length)) || !Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            CopyOption[] copyOptionArr = (CopyOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        }
        CopyActionResult copyActionResult = CopyActionResult.f406792b;
    }
}
