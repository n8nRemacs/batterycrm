package defpackage;

import com.facebook.common.file.FileUtils$CreateDirectoryException;
import com.facebook.common.file.FileUtils$FileDeleteException;
import com.facebook.common.file.FileUtils$ParentDirNotFoundException;
import com.facebook.common.file.FileUtils$RenameException;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class obj {
    public static void a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                String absolutePath = file.getAbsolutePath();
                FileUtils$FileDeleteException fileUtils$FileDeleteException = new FileUtils$FileDeleteException(file.getAbsolutePath());
                FileUtils$CreateDirectoryException fileUtils$CreateDirectoryException = new FileUtils$CreateDirectoryException(absolutePath);
                fileUtils$CreateDirectoryException.initCause(fileUtils$FileDeleteException);
                throw fileUtils$CreateDirectoryException;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new FileUtils$CreateDirectoryException(file.getAbsolutePath());
        }
    }

    public static void b(File file, File file2) {
        file.getClass();
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        Throwable fileNotFoundException = !file2.exists() ? file.getParentFile().exists() ? !file.exists() ? new FileNotFoundException(file.getAbsolutePath()) : null : new FileUtils$ParentDirNotFoundException(file.getAbsolutePath()) : new FileUtils$FileDeleteException(file2.getAbsolutePath());
        FileUtils$RenameException fileUtils$RenameException = new FileUtils$RenameException("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath());
        fileUtils$RenameException.initCause(fileNotFoundException);
        throw fileUtils$RenameException;
    }

    public static final mwd c(x26 x26Var) {
        int i = s65.d;
        long jI = v9j.i(300L, y65.MILLISECONDS);
        uid uidVar = new uid();
        rt7 rt7VarA = eoi.a();
        rt7VarA.D();
        uidVar.a = rt7VarA;
        return new mwd(new rcf(new n46(x26Var, new er(uidVar, (Continuation) null, 13)), uidVar, jI, null));
    }
}
