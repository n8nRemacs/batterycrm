package sX0;

import androidx.appcompat.app.r;
import com.fasterxml.jackson.databind.ser.std.C36485k;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: OptionalHandlerFactory.java */
/* renamed from: sX0.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C48129k implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final Class<?> f437704d;

    /* renamed from: e, reason: collision with root package name */
    public static final Class<?> f437705e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC48123e f437706f;

    /* renamed from: g, reason: collision with root package name */
    public static final C48129k f437707g;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f437708b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f437709c;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:13:0x0007
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:131)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        /*
            r0 = 0
            java.lang.Class<org.w3c.dom.Node> r1 = org.w3c.dom.Node.class
            java.lang.Class<org.w3c.dom.Document> r2 = org.w3c.dom.Document.class
            goto L8
        L6:
            r1 = r0
        L7:
            r2 = r0
        L8:
            sX0.C48129k.f437704d = r1
            sX0.C48129k.f437705e = r2
            sX0.e r0 = sX0.AbstractC48123e.f437700a     // Catch: java.lang.Throwable -> Le
        Le:
            sX0.C48129k.f437706f = r0
            sX0.k r0 = new sX0.k
            r0.<init>()
            sX0.C48129k.f437707g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sX0.C48129k.<clinit>():void");
    }

    public C48129k() {
        HashMap map = new HashMap();
        this.f437708b = map;
        map.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        map.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap map2 = new HashMap();
        this.f437709c = map2;
        map2.put("java.sql.Timestamp", C36485k.f342379g);
        map2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        map2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        map2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        map2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    public static Object a(com.fasterxml.jackson.databind.h hVar, Class cls) {
        try {
            return com.fasterxml.jackson.databind.util.g.h(false, cls);
        } catch (Throwable th2) {
            throw new IllegalStateException("Failed to create instance of `" + cls.getName() + "` for handling values of type " + com.fasterxml.jackson.databind.util.g.t(hVar) + ", problem: (" + th2.getClass().getName() + ") " + th2.getMessage());
        }
    }

    public static Object b(com.fasterxml.jackson.databind.h hVar, String str) {
        try {
            return a(hVar, Class.forName(str));
        } catch (Throwable th2) {
            StringBuilder sbA = r.A("Failed to find class `", str, "` for handling values of type ");
            sbA.append(com.fasterxml.jackson.databind.util.g.t(hVar));
            sbA.append(", problem: (");
            sbA.append(th2.getClass().getName());
            sbA.append(") ");
            sbA.append(th2.getMessage());
            throw new IllegalStateException(sbA.toString());
        }
    }
}
