package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class pub implements Externalizable {
    public boolean A0;
    public boolean C0;
    public boolean E0;
    public boolean G0;
    public boolean I0;
    public boolean K0;
    public boolean M0;
    public boolean O0;
    public boolean Q0;
    public boolean V0;
    public boolean X0;
    public boolean Y;
    public boolean Z0;
    public boolean a;
    public boolean b1;
    public boolean c;
    public boolean d1;
    public boolean j1;
    public boolean o;
    public boolean s0;
    public boolean u0;
    public boolean w0;
    public boolean y0;
    public qub b = null;
    public qub d = null;
    public qub X = null;
    public qub Z = null;
    public qub t0 = null;
    public qub v0 = null;
    public qub x0 = null;
    public qub z0 = null;
    public qub B0 = null;
    public qub D0 = null;
    public qub F0 = null;
    public qub H0 = null;
    public qub J0 = null;
    public qub L0 = null;
    public qub N0 = null;
    public qub P0 = null;
    public qub R0 = null;
    public String S0 = "";
    public int T0 = 0;
    public String U0 = "";
    public String W0 = "";
    public String Y0 = "";
    public String a1 = "";
    public String c1 = "";
    public String e1 = "";
    public boolean f1 = false;
    public final ArrayList g1 = new ArrayList();
    public final ArrayList h1 = new ArrayList();
    public boolean i1 = false;
    public String k1 = "";
    public boolean l1 = false;

    public void a(String str) {
        this.S0 = str;
    }

    public void b(String str) {
        this.U0 = str;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            qub qubVar = new qub();
            qubVar.readExternal(objectInput);
            this.a = true;
            this.b = qubVar;
        }
        if (objectInput.readBoolean()) {
            qub qubVar2 = new qub();
            qubVar2.readExternal(objectInput);
            this.c = true;
            this.d = qubVar2;
        }
        if (objectInput.readBoolean()) {
            qub qubVar3 = new qub();
            qubVar3.readExternal(objectInput);
            this.o = true;
            this.X = qubVar3;
        }
        if (objectInput.readBoolean()) {
            qub qubVar4 = new qub();
            qubVar4.readExternal(objectInput);
            this.Y = true;
            this.Z = qubVar4;
        }
        if (objectInput.readBoolean()) {
            qub qubVar5 = new qub();
            qubVar5.readExternal(objectInput);
            this.s0 = true;
            this.t0 = qubVar5;
        }
        if (objectInput.readBoolean()) {
            qub qubVar6 = new qub();
            qubVar6.readExternal(objectInput);
            this.u0 = true;
            this.v0 = qubVar6;
        }
        if (objectInput.readBoolean()) {
            qub qubVar7 = new qub();
            qubVar7.readExternal(objectInput);
            this.w0 = true;
            this.x0 = qubVar7;
        }
        if (objectInput.readBoolean()) {
            qub qubVar8 = new qub();
            qubVar8.readExternal(objectInput);
            this.y0 = true;
            this.z0 = qubVar8;
        }
        if (objectInput.readBoolean()) {
            qub qubVar9 = new qub();
            qubVar9.readExternal(objectInput);
            this.A0 = true;
            this.B0 = qubVar9;
        }
        if (objectInput.readBoolean()) {
            qub qubVar10 = new qub();
            qubVar10.readExternal(objectInput);
            this.C0 = true;
            this.D0 = qubVar10;
        }
        if (objectInput.readBoolean()) {
            qub qubVar11 = new qub();
            qubVar11.readExternal(objectInput);
            this.E0 = true;
            this.F0 = qubVar11;
        }
        if (objectInput.readBoolean()) {
            qub qubVar12 = new qub();
            qubVar12.readExternal(objectInput);
            this.G0 = true;
            this.H0 = qubVar12;
        }
        if (objectInput.readBoolean()) {
            qub qubVar13 = new qub();
            qubVar13.readExternal(objectInput);
            this.I0 = true;
            this.J0 = qubVar13;
        }
        if (objectInput.readBoolean()) {
            qub qubVar14 = new qub();
            qubVar14.readExternal(objectInput);
            this.K0 = true;
            this.L0 = qubVar14;
        }
        if (objectInput.readBoolean()) {
            qub qubVar15 = new qub();
            qubVar15.readExternal(objectInput);
            this.M0 = true;
            this.N0 = qubVar15;
        }
        if (objectInput.readBoolean()) {
            qub qubVar16 = new qub();
            qubVar16.readExternal(objectInput);
            this.O0 = true;
            this.P0 = qubVar16;
        }
        if (objectInput.readBoolean()) {
            qub qubVar17 = new qub();
            qubVar17.readExternal(objectInput);
            this.Q0 = true;
            this.R0 = qubVar17;
        }
        a(objectInput.readUTF());
        this.T0 = objectInput.readInt();
        b(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.V0 = true;
            this.W0 = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.X0 = true;
            this.Y0 = utf2;
        }
        if (objectInput.readBoolean()) {
            String utf3 = objectInput.readUTF();
            this.Z0 = true;
            this.a1 = utf3;
        }
        if (objectInput.readBoolean()) {
            String utf4 = objectInput.readUTF();
            this.b1 = true;
            this.c1 = utf4;
        }
        if (objectInput.readBoolean()) {
            String utf5 = objectInput.readUTF();
            this.d1 = true;
            this.e1 = utf5;
        }
        this.f1 = objectInput.readBoolean();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            nub nubVar = new nub();
            nubVar.readExternal(objectInput);
            this.g1.add(nubVar);
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            nub nubVar2 = new nub();
            nubVar2.readExternal(objectInput);
            this.h1.add(nubVar2);
        }
        this.i1 = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String utf6 = objectInput.readUTF();
            this.j1 = true;
            this.k1 = utf6;
        }
        this.l1 = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.a);
        if (this.a) {
            this.b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.c);
        if (this.c) {
            this.d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.o);
        if (this.o) {
            this.X.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Y);
        if (this.Y) {
            this.Z.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.s0);
        if (this.s0) {
            this.t0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.u0);
        if (this.u0) {
            this.v0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.w0);
        if (this.w0) {
            this.x0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.y0);
        if (this.y0) {
            this.z0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0);
        if (this.A0) {
            this.B0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.C0);
        if (this.C0) {
            this.D0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.E0);
        if (this.E0) {
            this.F0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.G0);
        if (this.G0) {
            this.H0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.I0);
        if (this.I0) {
            this.J0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.K0);
        if (this.K0) {
            this.L0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.M0);
        if (this.M0) {
            this.N0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.O0);
        if (this.O0) {
            this.P0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Q0);
        if (this.Q0) {
            this.R0.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.S0);
        objectOutput.writeInt(this.T0);
        objectOutput.writeUTF(this.U0);
        objectOutput.writeBoolean(this.V0);
        if (this.V0) {
            objectOutput.writeUTF(this.W0);
        }
        objectOutput.writeBoolean(this.X0);
        if (this.X0) {
            objectOutput.writeUTF(this.Y0);
        }
        objectOutput.writeBoolean(this.Z0);
        if (this.Z0) {
            objectOutput.writeUTF(this.a1);
        }
        objectOutput.writeBoolean(this.b1);
        if (this.b1) {
            objectOutput.writeUTF(this.c1);
        }
        objectOutput.writeBoolean(this.d1);
        if (this.d1) {
            objectOutput.writeUTF(this.e1);
        }
        objectOutput.writeBoolean(this.f1);
        ArrayList arrayList = this.g1;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((nub) arrayList.get(i)).writeExternal(objectOutput);
        }
        int size2 = this.h1.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((nub) this.h1.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.i1);
        objectOutput.writeBoolean(this.j1);
        if (this.j1) {
            objectOutput.writeUTF(this.k1);
        }
        objectOutput.writeBoolean(this.l1);
    }
}
