package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nub implements Externalizable {
    public boolean Y;
    public boolean d;
    public String a = "";
    public String b = "";
    public final ArrayList c = new ArrayList();
    public String o = "";
    public boolean X = false;
    public String Z = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        this.a = objectInput.readUTF();
        this.b = objectInput.readUTF();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.d = true;
            this.o = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.Y = true;
            this.Z = utf2;
        }
        this.X = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.a);
        objectOutput.writeUTF(this.b);
        int size = this.c.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) this.c.get(i));
        }
        objectOutput.writeBoolean(this.d);
        if (this.d) {
            objectOutput.writeUTF(this.o);
        }
        objectOutput.writeBoolean(this.Y);
        if (this.Y) {
            objectOutput.writeUTF(this.Z);
        }
        objectOutput.writeBoolean(this.X);
    }
}
